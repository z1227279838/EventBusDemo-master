package com.example.kson.eventbusdemo;

public class Test {
    public static void main(String[] ar){
        Observable observable = new Observable();
        Observer observer1 = new Observer();
        Observer observer2 = new Observer();
        Observer observer3 = new Observer();

        //订阅
        observable.register(observer1);
        observable.register(observer2);
        observable.register(observer3);

//        observable.cacelRegister(observer1);
        observable.notifyMsg();




    }
}
