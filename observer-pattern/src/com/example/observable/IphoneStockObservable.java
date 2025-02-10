package com.example.observable;

import java.util.ArrayList;
import java.util.List;

import com.example.observer.NotificationObserver;

public class IphoneStockObservable implements StockObservable {

    List<NotificationObserver> notificationObservers;

    public IphoneStockObservable() {
        this.notificationObservers = new ArrayList<>();
    }

    @Override
    public void addObserver(NotificationObserver o) {
        this.notificationObservers.add(o);
    }

    @Override
    public void removeObserver(NotificationObserver o) {
        // TODO Auto-generated method stub
        this.notificationObservers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (NotificationObserver o : this.notificationObservers) {
            o.update();
        }
    }

    @Override
    public void setStockCount(int stockCount) {
        if (stockCount > 1) {
            notifyObservers();
        }
    }
}
