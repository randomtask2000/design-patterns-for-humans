package com.randomtask2000.designpatterns;

import com.randomtask2000.designpatterns.Prototype.Sheep;
import org.junit.Test;

public class PrototypeTest {
    @Test
    public void cloneDolly_happyPath(){
        Sheep original = new Sheep("Jolly", "Mountain Sheep");
        System.out.println(original.getName()); // Jolly
        System.out.println(original.getCategory()); // Mountain Sheep

        // Clone and modify what is required
        Sheep cloned = clone original;
        cloned.setName("Dolly");
        System.out.println(cloned.getName()); // Dolly
        System.out.println(cloned.getCategory()); // Mountain sheep
    }
}
