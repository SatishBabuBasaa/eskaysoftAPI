package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "area")
public class Area implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long areaId;
	private String areaName;
	private String executiveName;

	public Area() {
		super();
	}

	public Area(Long areaId, String areaName, String executiveName) {
		super();
		this.areaId = areaId;
		this.areaName = areaName;
		this.executiveName = executiveName;
	}

	public Area(String areaName, String executiveName) {
		super();
		this.areaName = areaName;
		this.executiveName = executiveName;
	}

	/**
	 * @return the areaId
	 */
	public Long getAreaId() {
		return areaId;
	}

	/**
	 * @param areaId
	 *            the areaId to set
	 */
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	/**
	 * @return the areaName
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * @param areaName
	 *            the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	/**
	 * @return the executiveName
	 */
	public String getExecutiveName() {
		return executiveName;
	}

	/**
	 * @param executiveName
	 *            the executiveName to set
	 */
	public void setExecutiveName(String executiveName) {
		this.executiveName = executiveName;
	}
}
