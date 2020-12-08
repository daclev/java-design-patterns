package com.daclev;

public class ConcreteSubscriberB implements  Subscriber
{
    public ConcreteSubscriberB(ConcretePublisher publisher){
        publisher.registerObserver(this);
    }

    @Override
    public void update()
    {
        System.out.println("Hello from ConcreteSubscriberB");
    }
}
