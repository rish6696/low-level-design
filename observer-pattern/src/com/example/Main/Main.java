package com.example.Main;

import com.example.observable.IphoneStockObservable;
import com.example.observable.StockObservable;
import com.example.observer.EmailObserver;
import com.example.observer.NotificationObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable observable = new IphoneStockObservable();
        NotificationObserver observer = new EmailObserver(observable);
        observable.addObserver(observer);

        observable.setStockCount(20);

    }
}
