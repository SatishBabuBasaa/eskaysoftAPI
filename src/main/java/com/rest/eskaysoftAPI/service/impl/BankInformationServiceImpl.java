package com.rest.eskaysoftAPI.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.BankInformationDao;
import com.rest.eskaysoftAPI.dto.BankInformationDTO;
import com.rest.eskaysoftAPI.entity.BankInformation;
import com.rest.eskaysoftAPI.service.BankInformationService;

@Service("bankinformationService")
public class BankInformationServiceImpl implements BankInformationService {

	@Autowired
	BankInformationDao bankinformationDao;

	@Override
	public List<BankInformationDTO> getBankInformation() {
		List<BankInformation> bankinformation = new ArrayList<>(bankinformationDao.findAll());
		List<BankInformationDTO> bankinformationList = null;
		if (bankinformation != null) {
			bankinformationList = new ArrayList<BankInformationDTO>();
			for (BankInformation bankInformation : bankinformation) {
				BankInformationDTO bankinformationDTO = new BankInformationDTO(bankInformation.getBankId(), bankInformation.getName(), bankInformation.getAddress());
				bankinformationList.add(bankinformationDTO);
			}
		}
		return bankinformationList;
	}

	@Override
	public BankInformationDTO updateBankInformation(BankInformationDTO bankinformationDTO) {
		BankInformation bankinformation = bankinformationDao.findOne(bankinformationDTO.getBankId());
		if (bankinformation != null) {
			bankinformation.setName(bankinformationDTO.getName());
			bankinformation.setAddress(bankinformationDTO.getAddress());
			bankinformation = bankinformationDao.save(bankinformation);
			if (null != bankinformation) {
				return bankinformationDTO;
			}
		}
		return null;
	}

	@Override
	public boolean createBankInformation(BankInformationDTO bankinformationDTO) {
		try {
			BankInformation bankinformation = new BankInformation(bankinformationDTO.getName(), bankinformationDTO.getAddress());
			BankInformation savedBankInformation = bankinformationDao.save(bankinformation);
			return savedBankInformation == null ? false : true;
		} catch (Exception e) {
			System.out.println("Unable to create bankinformation:" + bankinformationDTO.getName());
		}
		return false;
	}

	@Override
	public boolean deleteBankInformation(BankInformationDTO bankinformationDTO) {
		try {
			bankinformationDao.delete(bankinformationDTO.getBankId());
			return true;
		} catch (Exception e) {
			System.out.println("Unable to delete bankinformation having id:" + bankinformationDTO.getBankId());
		}
		return false;
	}

	@Override
	public BankInformationDTO getBankInformationById(Long bankId) {
		BankInformation bankinformation = bankinformationDao.findOne(bankId);
		if (bankinformation != null) {
			BankInformationDTO bankinformationDTO = new BankInformationDTO(bankinformation.getBankId(), bankinformation.getName(), bankinformation.getAddress());
			return bankinformationDTO;
		}
		return null;
	}

}