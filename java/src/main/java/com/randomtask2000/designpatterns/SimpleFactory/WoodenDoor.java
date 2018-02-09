package com.randomtask2000.designpatterns.SimpleFactory;

public class WoodenDoor implements Door {
    protected float width;
    protected float height;

    public WoodenDoor(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth()
    {
        return this.width;
    }

    public float getHeight()
    {
        return this.height;
    }
}