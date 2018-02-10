package com.randomtask2000.designpatterns.FactoryMethod;

public class MarketingManager extends HiringManager {
    protected Interviewer makeInterviewer() { return new CommunityExecutive(); }
}
