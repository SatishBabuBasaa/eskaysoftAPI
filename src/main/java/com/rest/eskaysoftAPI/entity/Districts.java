package com.rest.eskaysoftAPI.entity;

import javax.persistence.CascadeType;

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
	private Long districtId;

	private String districtName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "stateId")
	private States state;

	/**
	 * @return the state
	 */
	public States getState() {
		return state;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
}
