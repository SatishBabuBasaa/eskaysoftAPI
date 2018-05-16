package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

public class AreaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2099654952913091298L;
	private Long AreaId;
	private String AreaName;
	private String ExecutiveName;

	public AreaDTO() {

	}

	public AreaDTO(Long areaId, String areaName, String executiveName) {
		super();
		AreaId = areaId;
		AreaName = areaName;
		ExecutiveName = executiveName;
	}

	public AreaDTO(String areaName, String executiveName) {
		super();
		AreaName = areaName;
		ExecutiveName = executiveName;
	}

	/**
	 * @return the areaId
	 */
	public Long getAreaId() {
		return AreaId;
	}

	/**
	 * @param areaId
	 *            the areaId to set
	 */
	public void setAreaId(Long areaId) {
		AreaId = areaId;
	}

	/**
	 * @return the areaName
	 */
	public String getAreaName() {
		return AreaName;
	}

	/**
	 * @param areaName
	 *            the areaName to set
	 */
	public void setAreaName(String areaName) {
		AreaName = areaName;
	}

	/**
	 * @return the executiveName
	 */
	public String getExecutiveName() {
		return ExecutiveName;
	}

	/**
	 * @param executiveName
	 *            the executiveName to set
	 */
	public void setExecutiveName(String executiveName) {
		ExecutiveName = executiveName;
	}

}