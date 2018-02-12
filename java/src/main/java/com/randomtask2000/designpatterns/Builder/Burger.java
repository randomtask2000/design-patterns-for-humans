package com.randomtask2000.designpatterns.Builder;

public class Burger {
    protected int size;

    protected boolean cheese = false;
    protected boolean pepperoni = false;
    protected boolean lettuce = false;
    protected boolean tomato = false;

    public Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
    }
}