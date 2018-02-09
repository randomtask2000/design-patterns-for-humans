package com.randomtask2000.designpatterns;

import com.randomtask2000.designpatterns.SimpleFactory.Door;
import com.randomtask2000.designpatterns.SimpleFactory.DoorFactory;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleFactoryTest {
    @Test
    public void createDoor_happyPath(){
        Door door = DoorFactory.makeDoor(100F, 200F);
        assertThat(door.getWidth(), is(100F));
        assertThat(door.getHeight(), is(200F));
    }
}
