package com.example.kson.eventbusdemo;

/**
 * 抽象被观察者
 */
public interface IObservable {
    void register(IObserver iObserver);//注册观察者
    void cacelRegister(IObserver iObserver);//取消注册
    void notifyMsg();
}
