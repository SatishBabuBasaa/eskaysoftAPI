package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

import java.util.Date;

public class ScheduleDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2099654952913091298L;
	private Long Id;
	private String ScheduleName;
	private int ScheduleIndex;
	private String ScheduleType;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;

	public ScheduleDTO() {
	}

	public ScheduleDTO(Long id, String scheduleName, int scheduleIndex, String scheduleType, String createdBy,
			Date createdOn, String updatedBy, Date updatedOn) {
		super();
		Id = id;
		ScheduleName = scheduleName;
		ScheduleIndex = scheduleIndex;
		ScheduleType = scheduleType;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	public ScheduleDTO(String scheduleName, int scheduleIndex, String scheduleType, String createdBy, Date createdOn,
			String updatedBy, Date updatedOn) {
		super();
		ScheduleName = scheduleName;
		ScheduleIndex = scheduleIndex;
		ScheduleType = scheduleType;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
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

	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy
	 *            the createdBy to set
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
	 * @param createdOn
	 *            the createdOn to set
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
	 * @param updatedBy
	 *            the updatedBy to set
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
	 * @param updatedOn
	 *            the updatedOn to set
	 */
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

}