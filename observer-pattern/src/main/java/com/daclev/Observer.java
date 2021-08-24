package com.daclev;

public interface Observer
{
    void registerObserver(Subscriber subscriber);

    void unregisterObserver(Subscriber subscriber);

    void notifyObservers();
}
