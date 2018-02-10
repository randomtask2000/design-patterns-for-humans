package com.randomtask2000.designpatterns.AbstractFactory;

public class Welder implements DoorFittingExpert
{
    public function getDescription()
    {
        echo 'I can only fit iron doors';
    }
}