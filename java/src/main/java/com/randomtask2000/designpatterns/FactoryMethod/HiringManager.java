package com.randomtask2000.designpatterns.FactoryMethod;

public abstract class HiringManager {
    // FactoryMethod method
    protected abstract Interviewer makeInterviewer();

    public void takeInterview() {
        Interviewer interviewer = this.makeInterviewer();
        interviewer.askQuestions();
    }
}
