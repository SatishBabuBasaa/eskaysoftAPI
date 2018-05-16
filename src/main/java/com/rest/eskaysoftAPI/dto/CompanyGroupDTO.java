package com.rest.eskaysoftAPI.dto;

import java.io.Serializable;

import com.rest.eskaysoftAPI.entity.Company;

public class CompanyGroupDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2099654952913091298L;
	private Long Id;
	private Company company;
	private String companyGroup;

	public CompanyGroupDTO() {
		super();
	}

	public CompanyGroupDTO(Company company, String companyGroup) {
		super();
		this.company = company;
		this.companyGroup = companyGroup;
	}

	public CompanyGroupDTO(Long id, Company company, String companyGroup) {
		super();
		Id = id;
		this.company = company;
		this.companyGroup = companyGroup;
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

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	
}