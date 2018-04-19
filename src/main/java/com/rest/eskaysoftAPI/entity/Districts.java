package com.rest.eskaysoftAPI.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "districts")
public class Districts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int districtId;

	private String districtName;
	private long stateId;
	private States state;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	public States getStates() {
		return state;
	}

	public void setStates(States state) {
		this.state = state;
	}

	@Column(name = "state_id")
	public long getStateId() {
		return stateId;
	}

	public void setStateId(long stateId) {
		this.stateId = stateId;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
}
