package com.example.kson.eventbusdemo;

/**
 * 抽象观察者
 */
public interface IObserver {
    void receive(String msg);
}
