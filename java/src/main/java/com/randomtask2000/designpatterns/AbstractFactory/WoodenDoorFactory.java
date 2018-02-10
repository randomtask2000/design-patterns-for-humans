package com.randomtask2000.designpatterns.AbstractFactory;

// Wooden factory to return carpenter and wooden door
public class WoodenDoorFactory implements DoorFactory {
    public Door makeDoor() {
        return new WoodenDoor();
    }

    public DoorFittingExpert makeFittingExpert() {
        return new Carpenter();
    }
}