package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compnanyGroup")
public class CompanyGroup implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private Company company;
	private String companyGroup;

	public CompanyGroup(Long id, Company company, String companyGroup) {
		super();
		Id = id;
		this.company = company;
		this.companyGroup = companyGroup;
	}

	public CompanyGroup() {
		super();
	}

	public CompanyGroup(Company company, String companyGroup) {
		super();
		this.company = company;
		this.companyGroup = companyGroup;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
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

}