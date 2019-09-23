package com.walmart.ccpa.service;

import com.walmart.ccpa.entity.ServiceNowRequest;

public interface ServiceNowService {

	public ServiceNowRequest saveServiceNowMessage(String message) throws Exception;
	

}
