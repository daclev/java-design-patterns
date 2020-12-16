package com.daclev;

public class ConcreteSubscriber implements  Subscriber
{
    private final String id;

    public ConcreteSubscriber(String id){
        this.id = id;
    }

    @Override
    public void update()
    {
        System.out.println("update to " + getID());
    }

    @Override
    public String getID() {
        return id;
    }
}
