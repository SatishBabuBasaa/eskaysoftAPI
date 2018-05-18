package com.rest.eskaysoftAPI.service;

import java.util.List;

import com.rest.eskaysoftAPI.dto.PurchaseEntryDTO;

public interface PurchaseEntryService {
	/**
	 * 
	 * @return
	 */
	List<PurchaseEntryDTO> getPurchaseEntry();

	/**
	 * 
	 * @param purchaseId
	 * @return
	 */
	PurchaseEntryDTO getPurchaseById(Long purchaseId);

	/**
	 * 
	 * @param purchaseentry
	 * @return
	 */
	boolean createPurchaseEntry(PurchaseEntryDTO purchaseentry);

	/**
	 * 
	 * @param purchaseentry
	 * @return
	 */
	PurchaseEntryDTO updatePurchaseEntry(PurchaseEntryDTO purchaseentry);

	/**
	 * 
	 * @param purchaseentry
	 * @return
	 */
	boolean deletePurchaseEntry(PurchaseEntryDTO purchaseentry);

}
