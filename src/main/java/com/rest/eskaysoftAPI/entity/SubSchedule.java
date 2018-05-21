package com.rest.eskaysoftAPI.entity;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sub_schedules")
public class SubSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subScheduleId;
	private String subScheduleName;
	private String subScheduleType;
	private Long subScheduleIndex;
	private float credit;

	private float debit;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "scheduleId")
	private Schedule schedule;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;

	public SubSchedule() {

	}

	
	public SubSchedule(Long subScheduleId, String subScheduleName, String subScheduleType, Long subScheduleIndex,
			float credit, float debit, Schedule schedule, String createdBy, Date createdOn, String updatedBy,
			Date updatedOn) {
		super();
		this.subScheduleId = subScheduleId;
		this.subScheduleName = subScheduleName;
		this.subScheduleType = subScheduleType;
		this.subScheduleIndex = subScheduleIndex;
		this.credit = credit;
		this.debit = debit;
		this.schedule = schedule;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}



	public SubSchedule(String subScheduleName, String subScheduleType, Long subScheduleIndex, float credit, float debit,
			Schedule schedule, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		super();
		this.subScheduleName = subScheduleName;
		this.subScheduleType = subScheduleType;
		this.subScheduleIndex = subScheduleIndex;
		this.credit = credit;
		this.debit = debit;
		this.schedule = schedule;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}


	/**
	 * @return the schedule
	 */
	public Schedule getSchedule() {
		return schedule;
	}

	/**
	 * @param schedule
	 *            the schedule to set
	 */
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Long getSubScheduleId() {
		return subScheduleId;
	}

	public void setSubScheduleId(Long subScheduleId) {
		this.subScheduleId = subScheduleId;
	}

	public String getSubScheduleName() {
		return subScheduleName;
	}

	public void setSubScheduleName(String subScheduleName) {
		this.subScheduleName = subScheduleName;
	}

	public Long getSubScheduleIndex() {
		return subScheduleIndex;
	}

	public String getSubScheduleType() {
		return subScheduleType;
	}

	public void setScheduleType(String subScheduleType) {
		this.subScheduleType = subScheduleType;
	}

	public void setSubScheduleIndex(Long subScheduleIndex) {
		this.subScheduleIndex = subScheduleIndex;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public float getDebit() {
		return debit;
	}

	public void setDebit(float debit) {
		this.debit = debit;
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


	/**
	 * @param subScheduleType the subScheduleType to set
	 */
	public void setSubScheduleType(String subScheduleType) {
		this.subScheduleType = subScheduleType;
	}
	
}