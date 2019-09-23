package com.walmart.ccpa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.ccpa.entity.ServiceNowMessage;
import com.walmart.ccpa.entity.ServiceNowRequest;
import com.walmart.ccpa.repository.CBBandCCPARepository;
import com.walmart.ccpa.service.ServiceNowService;
import com.walmart.ccpa.service.ServiceNowServiceImpl;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ServiceNowController {
	
	private static final Logger logger = LoggerFactory.getLogger(ServiceNowServiceImpl.class);
	
	@Autowired
	CBBandCCPARepository cbbAndCCPARepository;
	
	@Autowired
	ServiceNowService serviceNowService;

	@PostMapping(path = "/request")
	public ResponseEntity<Void> saveRequest(@RequestBody String  serviceNowMessage) throws Exception {
		
		
		logger.info("serviceNowMessage is:" + serviceNowMessage);
		serviceNowService.saveServiceNowMessage(serviceNowMessage);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
}
