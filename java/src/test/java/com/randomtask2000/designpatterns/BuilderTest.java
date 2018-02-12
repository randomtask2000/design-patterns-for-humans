package com.randomtask2000.designpatterns;

import com.randomtask2000.designpatterns.Builder.Burger;
import com.randomtask2000.designpatterns.Builder.BurgerBuilder;
import org.junit.Test;

public class BuilderTest {
    @Test
    public void buildBurger_happyPath(){
        Burger burger = new BurgerBuilder(14)
                            .addPepperoni()
                            .addLettuce()
                            .addTomato()
                            .build();
    }
}
