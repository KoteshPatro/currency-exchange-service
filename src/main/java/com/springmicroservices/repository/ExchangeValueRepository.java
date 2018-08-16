package com.springmicroservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmicroservices.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	
	ExchangeValue findByFromAndTo(String from,String to);
	
}
