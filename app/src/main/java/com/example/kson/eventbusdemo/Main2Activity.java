package com.example.kson.eventbusdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        EventBus.getDefault().register(this);
    }

//    /**
//     * 支持粘性事件
//     * @param s
//     */
//    @Subscribe(sticky = true)
//    public void receive1(String s){
//
//        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
//
//    }

    public void to1(View view) {

        new Thread(new Runnable() {
                @Override
                public void run() {
                String s = "我是2的数据";
                String s1 = "我是2的数据11111";
                //发送普通的string字符串事件
                EventBus.getDefault().post(s);
                System.out.println("post:"+Thread.currentThread().getName());
            }
        }).start();

//       EventBus.getDefault().post(s1);

    //    EventBus.getDefault().post(new User("kson"));
        this.finish();
    }
}
