package com.rest.eskaysoftAPI.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.ScheduleDao;
import com.rest.eskaysoftAPI.entity.Schedule;
import com.rest.eskaysoftAPI.entity.SchedulesEntity;
import com.rest.eskaysoftAPI.service.ScheduleService;


@Service("scheduleService")
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	ScheduleDao scheduleDao;

	@Override
	public SchedulesEntity getSchedules() {
		List<Schedule> schedules = scheduleDao.findAll();
		SchedulesEntity schedulesEntity = new SchedulesEntity();
		schedulesEntity.setSchedules(schedules);
		return schedulesEntity;
	}

	@Override
	public Schedule getScheduleById(Long scheduleId) {
		return scheduleDao.getOne(scheduleId);
	}

}
