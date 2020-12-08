package com.daclev;

public interface Publisher
{
    void registerObserver(Subscriber subscriber);

    void unregisterObserver(Subscriber subscriber);

    void notifyObservers();
}
