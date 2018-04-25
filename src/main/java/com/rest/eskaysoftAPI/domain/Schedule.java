package com.rest.eskaysoftAPI.domain;

import java.io.Serializable;

public class Schedule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2099654952913091298L;
	private Long Id;
	private String ScheduleName;
	private int ScheduleIndex;
	private String ScheduleType;

	public Schedule() {
		
	}
	
	public Schedule(Long id, String scheduleName, int scheduleIndex, String scheduleType) {
		Id = id;
		ScheduleName = scheduleName;
		ScheduleIndex = scheduleIndex;
		ScheduleType = scheduleType;
	}
	
	public Schedule(String scheduleName, int scheduleIndex, String scheduleType) {
		ScheduleName = scheduleName;
		ScheduleIndex = scheduleIndex;
		ScheduleType = scheduleType;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		this.Id = id;
	}

	public String getScheduleName() {
		return ScheduleName;
	}

	public void setScheduleName(String scheduleName) {
		this.ScheduleName = scheduleName;
	}

	public int getScheduleIndex() {
		return ScheduleIndex;
	}

	public void setScheduleIndex(int scheduleIndex) {
		this.ScheduleIndex = scheduleIndex;
	}

	public String getScheduleType() {
		return ScheduleType;
	}

	public void setScheduleType(String scheduleType) {
		this.ScheduleType = scheduleType;

	}
}
