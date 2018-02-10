package com.randomtask2000.designpatterns.Factory;

public class MarketingManager extends HiringManager {
    protected Interviewer makeInterviewer() { return new CommunityExecutive(); }
}
