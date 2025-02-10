package com.example.observer;

import com.example.observable.StockObservable;

public class EmailObserver implements NotificationObserver {

    StockObservable observable;

    public EmailObserver(StockObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Sending Email");

    }

}
