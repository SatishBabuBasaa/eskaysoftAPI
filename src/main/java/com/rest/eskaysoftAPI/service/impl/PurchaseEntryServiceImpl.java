package com.rest.eskaysoftAPI.service.impl;

import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.eskaysoftAPI.dao.PurchaseEntryDao;
import com.rest.eskaysoftAPI.dto.PurchaseEntryDTO;
import com.rest.eskaysoftAPI.entity.PurchaseEntry;
import com.rest.eskaysoftAPI.service.PurchaseEntryService;

@Service("purchaseEntryService")
public class PurchaseEntryServiceImpl implements PurchaseEntryService {

	@Autowired
	PurchaseEntryDao purchaseEntryDao;

	@Override
	public List<PurchaseEntryDTO> getPurchaseEntry() {
		List<PurchaseEntry> purchaseentry = new ArrayList<>(purchaseEntryDao.findAll());
		List<PurchaseEntryDTO> purchaseEntryList = null;
		if (purchaseentry != null) {
			purchaseEntryList = new ArrayList<PurchaseEntryDTO>();
			for (PurchaseEntry purchaseentries : purchaseentry) {
				PurchaseEntryDTO purchaseEntryDTO = new PurchaseEntryDTO(purchaseentries.getCreditAdjustmentLedger(),
						purchaseentries.getDebitAdjustmentLedger(), purchaseentries.getBatch(), purchaseentries.getCS(),
						purchaseentries.getInvoiceNumber(), purchaseentries.getDate(),
						purchaseentries.getDeliveredForm(), purchaseentries.getExpiry(), purchaseentries.getGSTIN(),
						purchaseentries.getHSN(), purchaseentries.getLRNumber(), purchaseentries.getInvoiceDate(),
						purchaseentries.getLRDate(), purchaseentries.getProduct(), purchaseentries.getMfgName(),
						purchaseentries.getMode(), purchaseentries.getQuantity(), purchaseentries.getCGSTAmount(),
						purchaseentries.getCreditAdjustmentValue(), purchaseentries.getDebitAdjustmentValue(),
						purchaseentries.getDiscount(), purchaseentries.getDiscountValue(), purchaseentries.getRemarks(),
						purchaseentries.getGrossValue(), purchaseentries.getSupplier(), purchaseentries.getGrsValue(),
						purchaseentries.getGSTPercent(), purchaseentries.getInvoiceValue(), purchaseentries.getMRP(),
						purchaseentries.getNetValue(), purchaseentries.getTaxable(), purchaseentries.getOtherCharges(),
						purchaseentries.getPTD(), purchaseentries.getPurchaseId(), purchaseentries.getPurchaseNumber(),
						purchaseentries.getTransport(), purchaseentries.getSaleRate(), purchaseentries.getSGSTAmount(),
						purchaseentries.getTaxValue(),purchaseentries.getCreatedBy(),purchaseentries.getCreatedOn(),
						purchaseentries.getUpdatedBy(),purchaseentries.getUpdatedOn());
				purchaseEntryList.add(purchaseEntryDTO);
			}
		}

		return purchaseEntryList;
	}

	@Override
	public PurchaseEntryDTO getPurchaseById(Long purchaseId) {
		PurchaseEntry purchaseentry = purchaseEntryDao.findOne(purchaseId);
		if (purchaseentry != null) {
			PurchaseEntryDTO purchaseEntryDTO = new PurchaseEntryDTO(purchaseentry.getCreditAdjustmentLedger(),
					purchaseentry.getDebitAdjustmentLedger(), purchaseentry.getBatch(), purchaseentry.getCS(),
					purchaseentry.getInvoiceNumber(), purchaseentry.getDate(), purchaseentry.getDeliveredForm(),
					purchaseentry.getExpiry(), purchaseentry.getGSTIN(), purchaseentry.getHSN(),
					purchaseentry.getLRNumber(), purchaseentry.getInvoiceDate(), purchaseentry.getLRDate(),
					purchaseentry.getProduct(), purchaseentry.getMfgName(), purchaseentry.getMode(),
					purchaseentry.getQuantity(), purchaseentry.getCGSTAmount(),
					purchaseentry.getCreditAdjustmentValue(), purchaseentry.getDebitAdjustmentValue(),
					purchaseentry.getDiscount(), purchaseentry.getDiscountValue(), purchaseentry.getRemarks(),
					purchaseentry.getGrossValue(), purchaseentry.getSupplier(), purchaseentry.getGrsValue(),
					purchaseentry.getGSTPercent(), purchaseentry.getInvoiceValue(), purchaseentry.getMRP(),
					purchaseentry.getNetValue(), purchaseentry.getTaxable(), purchaseentry.getOtherCharges(),
					purchaseentry.getPTD(), purchaseentry.getPurchaseId(), purchaseentry.getPurchaseNumber(),
					purchaseentry.getTransport(), purchaseentry.getSaleRate(), purchaseentry.getSGSTAmount(),
					purchaseentry.getTaxValue(),purchaseentry.getCreatedBy(),purchaseentry.getCreatedOn(),
					purchaseentry.getUpdatedBy(),purchaseentry.getUpdatedOn());
			return purchaseEntryDTO;
		}
		return null;
	}

	@Override
	public PurchaseEntryDTO updatePurchaseEntry(PurchaseEntryDTO purchaseEntryDTO) {
		PurchaseEntry purchaseentry = purchaseEntryDao.findOne(purchaseEntryDTO.getPurchaseId());

		if (purchaseentry != null) {

			purchaseentry.setCreditAdjustmentLedger(purchaseEntryDTO.getCreditAdjustmentLedger());
			purchaseentry.setDebitAdjustmentLedger(purchaseEntryDTO.getDebitAdjustmentLedger());
			purchaseentry.setBatch(purchaseEntryDTO.getBatch());
			purchaseentry.setCS(purchaseEntryDTO.getCS());
			purchaseentry.setInvoiceNumber(purchaseEntryDTO.getInvoiceNumber());
			purchaseentry.setDate(purchaseEntryDTO.getDate());
			purchaseentry.setDeliveredForm(purchaseEntryDTO.getDeliveredForm());
			purchaseentry.setExpiry(purchaseEntryDTO.getExpiry());
			purchaseentry.setGSTIN(purchaseEntryDTO.getGSTIN());
			purchaseentry.setHSN(purchaseEntryDTO.getHSN());
			purchaseentry.setLRNumber(purchaseEntryDTO.getLRNumber());
			purchaseentry.setInvoiceDate(purchaseEntryDTO.getInvoiceDate());
			purchaseentry.setLRDate(purchaseEntryDTO.getLRDate());
			purchaseentry.setProduct(purchaseEntryDTO.getProduct());
			purchaseentry.setMfgName(purchaseEntryDTO.getMfgName());
			purchaseentry.setMode(purchaseEntryDTO.getMode());
			purchaseentry.setQuantity(purchaseEntryDTO.getQuantity());
			purchaseentry.setCGSTAmount(purchaseEntryDTO.getCGSTAmount());
			purchaseentry.setCreditAdjustmentValue(purchaseEntryDTO.getCreditAdjustmentValue());
			purchaseentry.setDebitAdjustmentValue(purchaseEntryDTO.getDebitAdjustmentValue());
			purchaseentry.setDiscount(purchaseEntryDTO.getDiscount());
			purchaseentry.setDiscountValue(purchaseEntryDTO.getDiscountValue());
			purchaseentry.setRemarks(purchaseEntryDTO.getRemarks());
			purchaseentry.setGrossValue(purchaseEntryDTO.getGrossValue());
			purchaseentry.setSupplier(purchaseEntryDTO.getSupplier());
			purchaseentry.setGrsValue(purchaseEntryDTO.getGrsValue());
			purchaseentry.setGSTPercent(purchaseEntryDTO.getGSTPercent());
			purchaseentry.setInvoiceValue(purchaseEntryDTO.getInvoiceValue());
			purchaseentry.setMRP(purchaseEntryDTO.getMRP());
			purchaseentry.setNetValue(purchaseEntryDTO.getNetValue());
			purchaseentry.setTaxable(purchaseEntryDTO.getTaxable());
			purchaseentry.setOtherCharges(purchaseEntryDTO.getOtherCharges());
			purchaseentry.setPTD(purchaseEntryDTO.getPTD());
			purchaseentry.setPurchaseId(purchaseEntryDTO.getPurchaseNumber());
			purchaseentry.setTransport(purchaseEntryDTO.getTransport());
			purchaseentry.setSaleRate(purchaseEntryDTO.getSaleRate());
			purchaseentry.setSGSTAmount(purchaseEntryDTO.getSGSTAmount());
			purchaseentry.setTaxValue(purchaseEntryDTO.getTaxValue());
			purchaseentry.setCreatedBy(purchaseEntryDTO.getCreatedBy());
			purchaseentry.setCreatedOn(purchaseEntryDTO.getCreatedOn());
			purchaseentry.setUpdatedBy(purchaseEntryDTO.getUpdatedBy());
			purchaseentry.setUpdatedOn(purchaseEntryDTO.getUpdatedOn());
			if (null != purchaseentry) {
				return purchaseEntryDTO;
			}
		}

		return null;
	}

	@Override
	public boolean createPurchaseEntry(PurchaseEntryDTO purchaseEntryDTO) {
		try {
			PurchaseEntry purchaseentry = new PurchaseEntry(null, purchaseEntryDTO.getCreditAdjustmentLedger(),
					purchaseEntryDTO.getDebitAdjustmentLedger(), purchaseEntryDTO.getBatch(), purchaseEntryDTO.getCS(),
					purchaseEntryDTO.getInvoiceNumber(), purchaseEntryDTO.getDate(),
					purchaseEntryDTO.getDeliveredForm(), purchaseEntryDTO.getExpiry(), purchaseEntryDTO.getGSTIN(),
					purchaseEntryDTO.getHSN(), purchaseEntryDTO.getLRNumber(), purchaseEntryDTO.getInvoiceDate(),
					purchaseEntryDTO.getLRDate(), purchaseEntryDTO.getProduct(), purchaseEntryDTO.getMfgName(),
					purchaseEntryDTO.getMode(), purchaseEntryDTO.getQuantity(), purchaseEntryDTO.getCGSTAmount(),
					purchaseEntryDTO.getCreditAdjustmentValue(), purchaseEntryDTO.getDebitAdjustmentValue(),
					purchaseEntryDTO.getDiscount(), purchaseEntryDTO.getDiscountValue(), purchaseEntryDTO.getRemarks(),
					purchaseEntryDTO.getGrossValue(), purchaseEntryDTO.getSupplier(), purchaseEntryDTO.getGrsValue(),
					purchaseEntryDTO.getGSTPercent(), purchaseEntryDTO.getInvoiceValue(), purchaseEntryDTO.getMRP(),
					purchaseEntryDTO.getNetValue(), purchaseEntryDTO.getTaxable(), purchaseEntryDTO.getOtherCharges(),
					purchaseEntryDTO.getPTD(), purchaseEntryDTO.getPurchaseId(), purchaseEntryDTO.getPurchaseNumber(),
					purchaseEntryDTO.getTransport(), purchaseEntryDTO.getSaleRate(), purchaseEntryDTO.getSGSTAmount(),
					purchaseEntryDTO.getTaxValue(),purchaseEntryDTO.getCreatedBy(),purchaseEntryDTO.getCreatedOn(),
					purchaseEntryDTO.getUpdatedBy(),purchaseEntryDTO.getUpdatedOn());
			PurchaseEntry savedPurchaseEntry = purchaseEntryDao.save(purchaseentry);
			return savedPurchaseEntry == null ? false : true;
		} catch (Exception e) {
			System.out.println("Unable to create purchase entry:" + purchaseEntryDTO.getPurchaseNumber());
		}
		return false;
	}

	@Override
	public boolean deletePurchaseEntry(PurchaseEntryDTO purchaseEntryDTO) {
		try {
			purchaseEntryDao.delete(purchaseEntryDTO.getPurchaseId());
			return true;
		} catch (Exception e) {
			System.out.println("Unable to delete purchase entry having id:" + purchaseEntryDTO.getPurchaseId());
		}
		return false;
	}

}
