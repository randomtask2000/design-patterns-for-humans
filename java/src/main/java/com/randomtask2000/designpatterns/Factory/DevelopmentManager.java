package com.randomtask2000.designpatterns.Factory;

public class DevelopmentManager extends HiringManager {
    protected Interviewer makeInterviewer() {
        return new Developer();
    }
}
