package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

import com.rest.eskaysoftAPI.entity.Company;

public class CompanyDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2099654952913091298L;
	private Long id;
	private String companyCode;
	private String companyGroup;
	private String companyStatus;
	private String invGenType;
	private String invPrefix;
	private String companyType;

	public CompanyDTO() {
		super();
	}

	
	public CompanyDTO(Long id, String companyCode, String companyGroup, String companyStatus, String companyType,String invGenType, String invPrefix) {
		super();
		this.id= id;
		this.companyCode = companyCode;
		this.companyGroup = companyGroup;
		this.companyStatus = companyStatus;
		this.companyType = companyType;
		this.invGenType = invGenType;
		this.invPrefix = invPrefix;
		
	}


	public CompanyDTO(String companyCode, String companyGroup, String companyStatus, String companyType,
			 String invGenType, String invPrefix) {
		
		this.companyCode = companyCode;
		this.companyGroup = companyGroup;
		this.companyStatus = companyStatus;
		this.companyType = companyType;
		this.invGenType = invGenType;
		this.invPrefix = invPrefix;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyGroup() {
		return companyGroup;
	}

	public void setCompanyGroup(String companyGroup) {
		this.companyGroup = companyGroup;
	}

	public String getCompanyStatus() {
		return companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public String getInvGenType() {
		return invGenType;
	}

	public void setInvGenType(String invGenType) {
		this.invGenType = invGenType;
	}

	public String getInvPrefix() {
		return invPrefix;
	}

	public void setInvPrefix(String invPrefix) {
		this.invPrefix = invPrefix;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}