package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.dto.BusinessExecutiveDTO;

public interface BusinessExecutiveService {
	/**
	 * 
	 * @return
	 */
	List<BusinessExecutiveDTO> getbusinessExecutives();

	BusinessExecutiveDTO getBusinessExecutivesById(Long id);

	/**
	 * 
	 * @param businessExecutive
	 * @return
	 */
	boolean createbusinessExecutive(BusinessExecutiveDTO businessExecutive);

	/**
	 * 
	 * @param businessExecutive
	 * @return
	 */
	BusinessExecutiveDTO updatebusinessExecutive(BusinessExecutiveDTO businessExecutive);

	/**
	 * 
	 * @param businessExecutive
	 * @return
	 */
	boolean deleteBusinessExecutive(BusinessExecutiveDTO businessExecutive);
}
