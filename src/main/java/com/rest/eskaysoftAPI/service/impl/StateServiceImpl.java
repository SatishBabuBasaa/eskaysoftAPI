package com.rest.eskaysoftAPI.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.StatesDao;
import com.rest.eskaysoftAPI.dto.StateDTO;
import com.rest.eskaysoftAPI.entity.States;
import com.rest.eskaysoftAPI.service.StateService;

@Service("stateService")
public class StateServiceImpl implements StateService {

	@Autowired
	StatesDao statesDao;

	@Override
	public List<StateDTO> getState() {
		List<States> states = new ArrayList<>(statesDao.findAll());
		List<StateDTO> stateList = null;
		if (states != null) {
			stateList = new ArrayList<StateDTO>();
			for (States state : states) {
				StateDTO scheduleDTO = new StateDTO(state.getId(), state.getStateName(), state.getStateCode(),
						state.getZone());
				stateList.add(scheduleDTO);
			}
		}
		return stateList;
	}

	@Override
	public StateDTO updateState(StateDTO stateDTO) {
		States state = statesDao.findOne(stateDTO.getId());
		if (state != null) {
			state.setStateName(stateDTO.getStateName());
			state.setStateCode(stateDTO.getStateCode());
			state.setZone(stateDTO.getZone());
			state = statesDao.save(state);
			if (null != state) {
				return stateDTO;
			}
		}
		return null;
	}

	@Override
	public boolean createState(StateDTO stateDTO) {
		try {
			States state = new States(stateDTO.getStateName(), stateDTO.getStateCode(), stateDTO.getZone());
			States savedState = statesDao.save(state);
			return savedState == null ? false : true;
		} catch (Exception e) {
			System.out.println("Unable to create schedule:" + stateDTO.getStateName());
		}
		return false;
	}

	@Override
	public boolean deleteState(StateDTO stateDTO) {
		try {
			statesDao.delete(stateDTO.getId());
			return true;
		} catch (Exception e) {
			System.out.println("Unable to delete state having id:" + stateDTO.getId());
		}
		return false;
	}

	@Override
	public StateDTO getStateById(Long id) {
		States state = statesDao.findOne(id);
		if (state != null) {
			StateDTO stateDTO = new StateDTO(state.getId(), state.getStateName(), state.getStateCode(),
					state.getZone());
			return stateDTO;
		}
		return null;
	}

}