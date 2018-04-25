package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.domain.Schedule;
import com.rest.eskaysoftAPI.domain.SchedulesEntity;

public interface ScheduleService {
	SchedulesEntity getSchedules();
	Schedule getScheduleById(Long scheduleId);
	boolean createSchedule(Schedule schedule);
}
