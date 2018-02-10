package com.randomtask2000.designpatterns.AbstractFactory;

public interface DoorFactory
{
    public function makeDoor(): Door;
    public function makeFittingExpert(): DoorFittingExpert;
}