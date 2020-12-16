package com.daclev;

import java.util.HashMap;

public class ConcretePublisher implements Publisher {
    private final HashMap<String, Subscriber> subscribers;

    public ConcretePublisher() {
        subscribers = new HashMap<>();
    }

    @Override
    public void registerObserver(Subscriber subscriber) {
        // may want to check for subscriber before adding
        subscribers.put(subscriber.getID(), subscriber);
    }

    @Override
    public void unregisterObserver(Subscriber subscriber) {
        subscribers.remove(subscriber.getID());
    }

    @Override
    public void notifyObservers() {
        subscribers.forEach((id, subscriber) -> subscriber.update());
    }

    public void broadcastUpdate() {
        notifyObservers();
    }

    public void updateObserver(String id) {
        if (subscribers.containsKey(id)) {
            subscribers.get(id).update();
        }
    }
}
