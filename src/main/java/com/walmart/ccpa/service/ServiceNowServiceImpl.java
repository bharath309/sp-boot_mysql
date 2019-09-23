package com.walmart.ccpa.service;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.ccpa.entity.ServiceNowRequest;
import com.walmart.ccpa.repository.CBBandCCPARepository;

@Service
public class ServiceNowServiceImpl implements ServiceNowService{
	
	private static final Logger logger = LoggerFactory.getLogger(ServiceNowServiceImpl.class);
	
	@Autowired
	private CBBandCCPARepository cbbAndCCPARepository;

	@Override
	public ServiceNowRequest saveServiceNowMessage(String message) throws Exception {
		logger.info("Method saveServiceNowMessage begins");
		
		ServiceNowRequest serviceNowRequest = new ServiceNowRequest();
		serviceNowRequest.setFormData(message);
		serviceNowRequest.setClientRequestId("1234567");
		serviceNowRequest.setClientTaskId("123abc");
		serviceNowRequest.setClientTraceId("234567");
		serviceNowRequest.setDateAdded(LocalDateTime.now());
		serviceNowRequest.setMasterRequestId(123456);
		serviceNowRequest.setLookupIds("\"lookupMode\": {\n" + 
				"        \"privacyCompliance\": {\n" + 
				"            \"action\": \" deleteRequest\"\n" + 
				"        },\n" + 
				"        \"placeholder_lookupWholeGraph\": {\n" + 
				"            \"filter1\": \"aaa\",\n" + 
				"            \"filter2\": \"bbb\"\n" + 
				"        }\n" + 
				"    }");
		serviceNowRequest.setMasterRequestType("sar");
		serviceNowRequest.setRequestCreationTime(LocalDateTime.now().minusHours(2));
		serviceNowRequest.setRequestSource("oneTrust");
		serviceNowRequest.setClientName("serviceNow");
		logger.info("Method saveServiceNowMessage ends");
		logger.info("*************"+serviceNowRequest.toString());
		
		return cbbAndCCPARepository.save(serviceNowRequest);
	}

}
