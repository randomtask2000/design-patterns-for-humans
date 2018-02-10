package com.randomtask2000.designpatterns;

import com.randomtask2000.designpatterns.AbstractFactory.Door;
import com.randomtask2000.designpatterns.AbstractFactory.DoorFittingExpert;
import com.randomtask2000.designpatterns.AbstractFactory.IronDoorFactory;
import com.randomtask2000.designpatterns.AbstractFactory.WoodenDoorFactory;
import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void abstractFactory_happyPath(){
        WoodenDoorFactory woodenFactory = new WoodenDoorFactory();
        Door door = woodenFactory.makeDoor();
        DoorFittingExpert expert = woodenFactory.makeFittingExpert();

        door.getDescription();  // Output: I am a wooden door
        expert.getDescription(); // Output: I can only fit wooden doors

        // Same for Iron Factory
        IronDoorFactory ironFactory = new IronDoorFactory();

        door = ironFactory.makeDoor();
        expert = ironFactory.makeFittingExpert();

        door.getDescription();  // Output: I am an iron door
        expert.getDescription(); // Output: I can only fit iron doors
    }
}
