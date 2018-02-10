package com.randomtask2000.designpatterns.SimpleFactory;

public class DoorFactory {
    public static Door makeDoor(float width, float height) {
        return new WoodenDoor(width, height);
    }
}
