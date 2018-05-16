package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

import com.rest.eskaysoftAPI.entity.Company;

public class CompanyGroupDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2099654952913091298L;
	private Company company;
	private String companyGroup;
	private Long compnayGroupId;

	public CompanyGroupDTO(Company company, String companyGroup) {
		this.company = company;
		this.companyGroup = companyGroup;
	}

	public CompanyGroupDTO(Company company, String companyGroup, Long compnayGroupId) {
		this.company = company;
		this.companyGroup = companyGroup;
		this.compnayGroupId = compnayGroupId;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getCompanyGroup() {
		return companyGroup;
	}

	public void setCompanyGroup(String companyGroup) {
		this.companyGroup = companyGroup;
	}

	public Long getCompnayGroupId() {
		return compnayGroupId;
	}

	public void setCompnayGroupId(Long compnayGroupId) {
		this.compnayGroupId = compnayGroupId;
	}

}