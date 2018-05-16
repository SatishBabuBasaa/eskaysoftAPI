package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schedules")
public class Schedule implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long scheduleId;
	private String scheduleName;
	private int scheduleIndex;
	private String scheduleType;

	public Schedule() {

	}

	public Schedule(Long id, String scheduleName, int scheduleIndex, String scheduleType) {
		super();
		this.scheduleId = id;
		this.scheduleName = scheduleName;
		this.scheduleIndex = scheduleIndex;
		this.scheduleType = scheduleType;
	}

	public Schedule(String scheduleName, int scheduleIndex, String scheduleType) {
		super();
		this.scheduleName = scheduleName;
		this.scheduleIndex = scheduleIndex;
		this.scheduleType = scheduleType;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return scheduleId;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.scheduleId = id;
	}

	/**
	 * @return the scheduleName
	 */
	public String getScheduleName() {
		return scheduleName;
	}

	/**
	 * @param scheduleName
	 *            the scheduleName to set
	 */
	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}

	/**
	 * @return the scheduleIndex
	 */
	public int getScheduleIndex() {
		return scheduleIndex;
	}

	/**
	 * @param scheduleIndex
	 *            the scheduleIndex to set
	 */
	public void setScheduleIndex(int scheduleIndex) {
		this.scheduleIndex = scheduleIndex;
	}

	public String getScheduleType() {
		return scheduleType;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}
}
