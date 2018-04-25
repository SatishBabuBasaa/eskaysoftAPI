package com.rest.eskaysoftAPI.domain;

import java.util.List;

public class SchedulesEntity {

	public List<Schedule> schedules;

	public SchedulesEntity() {

	}

	public SchedulesEntity(List<Schedule> schedules) {

	}

	public List<Schedule> getSchedule() {
		return schedules;
	}

	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}
}