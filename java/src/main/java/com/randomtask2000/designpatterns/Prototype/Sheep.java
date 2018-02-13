package com.randomtask2000.designpatterns.Prototype;

public class Sheep implements Cloneable {
    protected String name;
    protected String category = "Mountain Sheep";

    public Sheep(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public Sheep(Sheep source) {
        this.name = source.getName();
        this.category = source.getCategory();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Sheep(getName(), getCategory());
    }
}
