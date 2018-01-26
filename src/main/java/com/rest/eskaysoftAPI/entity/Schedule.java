package com.rest.eskaysoftAPI.entity;


import java.io.Serializable;
import java.util.HashMap;
  
public class Schedule implements Serializable {
  
    private static final long serialVersionUID = 1L;
  
    private int id;
    private String scheduleName;
    private int scheduleIndex;
    private HashMap<Integer,String> scheduleType;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getScheduleName() {
		return scheduleName;
	}
	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
	public int getScheduleIndex() {
		return scheduleIndex;
	}
	public void setScheduleIndex(int scheduleIndex) {
		this.scheduleIndex = scheduleIndex;
	}
	public HashMap<Integer, String> getScheduleType() {
		return scheduleType;
	}
	public void setScheduleType(HashMap<Integer, String> scheduleType) {
		this.scheduleType = scheduleType;
	}
  
    
}