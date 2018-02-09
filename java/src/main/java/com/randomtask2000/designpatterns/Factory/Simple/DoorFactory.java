package com.randomtask2000.designpatterns.Factory.Simple;

public class DoorFactory {
    public static Door makeDoor(float width, float height) {
        return new WoodenDoor(width, height);
    }
}
