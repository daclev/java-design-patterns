package com.daclev;

public class ConcreteSubscriberC implements  Subscriber
{
    public ConcreteSubscriberC(ConcretePublisher publisher){
        publisher.registerObserver(this);
    }

    @Override
    public void update()
    {
        System.out.println("Hello from ConcreteSubscriberC");
    }
}
