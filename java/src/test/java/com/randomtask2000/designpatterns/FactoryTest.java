package com.randomtask2000.designpatterns;

import com.randomtask2000.designpatterns.AbstractFactory.WoodenDoorFactory;
import com.randomtask2000.designpatterns.FactoryMethod.DevelopmentManager;
import com.randomtask2000.designpatterns.FactoryMethod.MarketingManager;
import com.randomtask2000.designpatterns.SimpleFactory.Door;
import com.randomtask2000.designpatterns.SimpleFactory.DoorFactory;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FactoryTest {
    @Test
    public void simpleFactory_createDoor_happyPath() {
        Door door = DoorFactory.makeDoor(100F, 200F);
        assertThat(door.getWidth(), is(100F));
        assertThat(door.getHeight(), is(200F));
    }
    @Test
    public void factoryMethod_createInterviewer_happyPath() {
        DevelopmentManager devManager = new DevelopmentManager();
        devManager.takeInterview(); // Output: Asking about design patterns

        MarketingManager marketingManager = new MarketingManager();
        marketingManager.takeInterview(); // Output: Asking about community building.
    }
    @Test
    public void abstractFactory_happyPath(){
        WoodenDoorFactory woodenFactory = new WoodenDoorFactory();

        door = woodenFactory.makeDoor();
        expert = woodenFactory.makeFittingExpert();

        door.getDescription();  // Output: I am a wooden door
        expert.getDescription(); // Output: I can only fit wooden doors

// Same for Iron Factory
        ironFactory = new IronDoorFactory();

        door = ironFactory.makeDoor();
        expert = ironFactory.makeFittingExpert();

        door.getDescription();  // Output: I am an iron door
        expert.getDescription(); // Output: I can only fit iron doors
    }
}
