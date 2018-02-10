package com.randomtask2000.designpatterns;

import com.randomtask2000.designpatterns.Factory.DevelopmentManager;
import com.randomtask2000.designpatterns.Factory.MarketingManager;
import com.randomtask2000.designpatterns.Factory.Simple.Door;
import com.randomtask2000.designpatterns.Factory.Simple.DoorFactory;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FactoryTest {
    @Test
    public void createDoor_happyPath(){
        Door door = DoorFactory.makeDoor(100F, 200F);
        assertThat(door.getWidth(), is(100F));
        assertThat(door.getHeight(), is(200F));
    }
    @Test
    public void createInterviewer_happyPath(){
        DevelopmentManager devManager = new DevelopmentManager();
        devManager.takeInterview(); // Output: Asking about design patterns

        MarketingManager marketingManager = new MarketingManager();
        marketingManager.takeInterview(); // Output: Asking about community building.
    }
}
