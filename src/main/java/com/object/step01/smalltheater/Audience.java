package com.object.step01.smalltheater;

public class Audience {
    private Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    public Long buy(Ticket ticket){
        return bag.hold(ticket);
    }
}
