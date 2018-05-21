package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;
import java.util.Date;

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
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;

	public Schedule() {

	}

	
	public Schedule(Long scheduleId, String scheduleName, int scheduleIndex, String scheduleType, String createdBy,
			Date createdOn, String updatedBy, Date updatedOn) {
		super();
		this.scheduleId = scheduleId;
		this.scheduleName = scheduleName;
		this.scheduleIndex = scheduleIndex;
		this.scheduleType = scheduleType;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}


	public Schedule(String scheduleName, int scheduleIndex, String scheduleType, String createdBy, Date createdOn,
			String updatedBy, Date updatedOn) {
		super();
		this.scheduleName = scheduleName;
		this.scheduleIndex = scheduleIndex;
		this.scheduleType = scheduleType;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
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


	/**
	 * @return the scheduleId
	 */
	public Long getScheduleId() {
		return scheduleId;
	}


	/**
	 * @param scheduleId the scheduleId to set
	 */
	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}


	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}


	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	/**
	 * @return the createdOn
	 */
	public Date getCreatedOn() {
		return createdOn;
	}


	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}


	/**
	 * @return the updatedBy
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}


	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	/**
	 * @return the updatedOn
	 */
	public Date getUpdatedOn() {
		return updatedOn;
	}


	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
}
