package com.rest.eskaysoftAPI.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.ScheduleDao;
import com.rest.eskaysoftAPI.domain.Schedule;
import com.rest.eskaysoftAPI.domain.SchedulesEntity;
import com.rest.eskaysoftAPI.service.ScheduleService;

@Service("scheduleService")
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	ScheduleDao scheduleDao;

	@Override
	public SchedulesEntity getSchedules() {
		List<com.rest.eskaysoftAPI.entity.Schedule> schedules = new ArrayList<> (scheduleDao.findAll());
		List<Schedule> scheduleList = new ArrayList<Schedule>();
		for(com.rest.eskaysoftAPI.entity.Schedule schedule :  schedules) {
			Schedule scheduleDomain = new Schedule(schedule.getId(), schedule.getScheduleName(), 
					schedule.getScheduleIndex(), schedule.getScheduleType());
			scheduleList.add(scheduleDomain);
		}
		SchedulesEntity schedulesEntity = new SchedulesEntity(scheduleList);
		return schedulesEntity;
	}

	@Override
	public Schedule getScheduleById(Long scheduleId) {
		//return scheduleDao.getOne(scheduleId);
		return null;
	}

	@Override
	public boolean createSchedule(Schedule schedule) {
		com.rest.eskaysoftAPI.entity.Schedule scheduleEntity = 
				new com.rest.eskaysoftAPI.entity.Schedule(schedule.getScheduleName(), schedule.getScheduleIndex(), 
						schedule.getScheduleType());
		com.rest.eskaysoftAPI.entity.Schedule savedSchedule = scheduleDao.save(scheduleEntity);
		return savedSchedule == null ? false : true;
	}

}
