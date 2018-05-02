package com.rest.eskaysoftAPI.domain;

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
	private String scheduleType;
	private long subScheduleIndex;
	private float credit;
	private float debit;
	private String schedule;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	public String getSchedules() {
		return this.schedule;
	}

	public void setSchedule(String schedule) {
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

	public long getSubScheduleIndex() {
		return subScheduleIndex;
	}

	public String getScheduleType() {
		return scheduleType;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}

	public void setSubScheduleIndex(long subScheduleIndex) {
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
}
