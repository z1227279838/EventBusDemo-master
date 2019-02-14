package com.example.kson.eventbusdemo;

/**
 * 观察者
 */
public class Observer implements IObserver {
    @Override
    public void receive(String msg) {
        System.out.println(msg);
    }
}
