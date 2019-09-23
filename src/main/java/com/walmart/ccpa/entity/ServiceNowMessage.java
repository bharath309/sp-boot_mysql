package com.walmart.ccpa.entity;

import org.springframework.stereotype.Component;

@Component("serviceNowMessage")
public class ServiceNowMessage {
	
	private String serviceNowMessage;

	public String getServiceNowMessage() {
		return serviceNowMessage;
	}

	public void setServiceNowMessage(String serviceNowMessage) {
		this.serviceNowMessage = serviceNowMessage;
	}

}
