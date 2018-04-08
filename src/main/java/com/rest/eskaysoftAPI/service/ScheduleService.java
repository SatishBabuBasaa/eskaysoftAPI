package com.rest.eskaysoftAPI.service;

import com.rest.eskaysoftAPI.entity.Schedule;
import com.rest.eskaysoftAPI.entity.SchedulesEntity;

public interface ScheduleService {
	SchedulesEntity getSchedules();
	Schedule getScheduleById(Long scheduleId);
}
