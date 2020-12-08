package com.daclev;

import java.util.ArrayList;

public class ConcretePublisher implements Publisher
{
    private final ArrayList<Subscriber> subscribers;

    public ConcretePublisher(){
        subscribers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Subscriber subscriber)
    {
        // may want to check for subscriber before adding
        subscribers.add(subscriber);
    }

    @Override
    public void unregisterObserver(Subscriber subscriber)
    {
        int index = subscribers.indexOf(subscriber);
        if (index >= 0) {
            subscribers.remove(index);
        }
    }

    @Override
    public void notifyObservers()
    {
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    public void someUpdate(){
        notifyObservers();
    }
}
