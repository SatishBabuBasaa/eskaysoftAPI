package com.rest.eskaysoftAPI.entity;

import java.util.ArrayList;

public class SchedulesEntity {
  
    private ArrayList<Schedule> schedules;
  
    public ArrayList<Schedule> getSchedule() {
        return schedules;
    }
  
    public void setSchedules(ArrayList<Schedule> schedules) {
        this.schedules = schedules;
    }
}