package com.rest.eskaysoftAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.Schedule;

@Repository
public interface ScheduleDao extends JpaRepository<Schedule, Long> {

}