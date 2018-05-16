package com.rest.eskaysoftAPI.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.eskaysoftAPI.entity.BusinessExecutives;


@Repository("businessexecutivesDao")
@Transactional
public interface BusinessExecutivesDao extends JpaRepository<BusinessExecutives, Long> {
}
