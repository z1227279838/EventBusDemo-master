package com.example.kson.eventbusdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.kson.eventbusdemo.R;
import com.example.kson.eventbusdemo.api.ApiService;
import com.example.kson.eventbusdemo.api.UserApiService;
import com.example.kson.eventbusdemo.bean.UserRegBean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
    }

    /**
     * 注册点击事件
     *
     * @param view
     */
    public void reg(View view) {

        //第一步创建retrofit管理器
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiService.BASE_URL)//主机名
                .addConverterFactory(GsonConverterFactory.create())//数据解析器
                .build();

        //第二步,实现接口
        UserApiService userApiService = retrofit.create(UserApiService.class);


        //第三步
        final Call<UserRegBean> register = userApiService.register("18612991023", "111111");

        //第四，请求
        register.enqueue(new Callback<UserRegBean>() {
            @Override
            public void onResponse(Call<UserRegBean> call, Response<UserRegBean> response) {

                UserRegBean userRegBean = response.body();//响应体

                Toast.makeText(RegActivity.this, userRegBean.message + "", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<UserRegBean> call, Throwable t) {

            }
        });
        //简化步骤
//        userApiService.register("","").enqueue(new Callback<UserRegBean>() {
//            @Override
//            public void onResponse(Call<UserRegBean> call, Response<UserRegBean> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<UserRegBean> call, Throwable t) {
//
//            }
//        });


    }
}
