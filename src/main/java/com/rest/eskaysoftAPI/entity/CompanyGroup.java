package com.rest.eskaysoftAPI.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Compnany_Group")
public class CompanyGroup implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long compnayGroupId;
	private Company company;
	private String companyGroup;
	

	public Long getCompnayGroupId() {
		return compnayGroupId;
	}

	public void setCompnayGroupId(Long compnayGroupId) {
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

	public CompanyGroup(Company company, String companyGroup, Long compnayGroupId) {
		super();
		this.company = company;
		this.companyGroup = companyGroup;
		this.compnayGroupId = compnayGroupId;
	}

	public CompanyGroup(Long id, Company company, String companyGroup, Long compnayGroupId) {
		super();
		this.company = company;
		this.companyGroup = companyGroup;
		this.compnayGroupId = compnayGroupId;
	}

	public void setCompanyGroup(String companyGroup) {
		this.companyGroup = companyGroup;
	}

}