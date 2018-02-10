package com.randomtask2000.designpatterns.AbstractFactory;

public class Welder implements DoorFittingExpert {
    public void getDescription() {
        System.out.println("I can only fit iron doors");
    }
}