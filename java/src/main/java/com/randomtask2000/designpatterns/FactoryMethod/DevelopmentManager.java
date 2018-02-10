package com.randomtask2000.designpatterns.FactoryMethod;

public class DevelopmentManager extends HiringManager {
    protected Interviewer makeInterviewer() {
        return new Developer();
    }
}
