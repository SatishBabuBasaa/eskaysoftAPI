package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.dto.CompanyDTO;
import com.rest.eskaysoftAPI.dto.CompanyGroupDTO;
import com.rest.eskaysoftAPI.entity.Company;

public interface CompanyGroupService {
	/**
	 * 
	 * @return
	 */
	List<CompanyGroupDTO> getCompaniesGroup();

	/**
	 * 
	 * @param companyId
	 * @return
	 */
	CompanyGroupDTO getCompanyGroupDTOById(Long companyGroupId);

	/**
	 * 
	 * @param CompaniesGroup
	 * @return
	 */
	boolean createCompanyGroup(CompanyGroupDTO companyGroup);

	/**
	 * 
	 * @param CompaniesGroup
	 * @return
	 */
	CompanyGroupDTO updateCompanyGroup(CompanyGroupDTO companyGroup);

	/**
	 * 
	 * @param CompaniesGroup
	 * @return
	 */
	boolean deleteCompanyGroup(CompanyGroupDTO companyGroup);



	

}
