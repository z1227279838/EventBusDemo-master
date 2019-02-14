package com.example.kson.eventbusdemo;

import java.util.ArrayList;
import java.util.List;

/**
 *被观察者
 */
public class Observable implements IObservable {
    private List<IObserver> list = new ArrayList<>();
    @Override
    public void register(IObserver iObserver) {

        if (iObserver!=null){
            list.add(iObserver);
        }

    }

    @Override
    public void cacelRegister(IObserver iObserver) {
        if (iObserver!=null){
            list.remove(iObserver);
        }



    }

    /**
     * 通知消息
     */
    @Override
    public void notifyMsg() {

        if (list!=null&&list.size()>0){
            for (IObserver iObserver : list) {
                iObserver.receive("我发出通知了");

            }
        }


    }
}
