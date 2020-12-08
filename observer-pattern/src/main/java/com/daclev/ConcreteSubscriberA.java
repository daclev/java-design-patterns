package com.daclev;

public class ConcreteSubscriberA implements  Subscriber
{
    public ConcreteSubscriberA(ConcretePublisher publisher){
        publisher.registerObserver(this);
    }

    @Override
    public void update()
    {
        System.out.println("Hello from ConcreteSubscriberA");
    }
}
