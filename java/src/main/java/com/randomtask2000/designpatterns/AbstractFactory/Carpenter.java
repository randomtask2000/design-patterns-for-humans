package com.randomtask2000.designpatterns.AbstractFactory;

public class Carpenter implements DoorFittingExpert
{
    public function getDescription()
    {
        echo 'I can only fit wooden doors';
    }
}
