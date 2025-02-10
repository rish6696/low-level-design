package com.example.observable;

import com.example.observer.NotificationObserver;

public interface StockObservable {
    public void addObserver(NotificationObserver o);

    public void removeObserver(NotificationObserver o);

    public void notifyObservers();

    public void setStockCount(int stockCount);

}
