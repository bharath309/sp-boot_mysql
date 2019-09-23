package com.walmart.ccpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rawdata")
public class ServiceNowRequest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "masterrequestid")
	private Integer masterRequestId;
	
	@Column(name = "requestsource")
	private String requestSource;
	
	@Column(name = "masterrequesttype")
	private String masterRequestType;
	
	@Column(name = "requestcreationtime")
	private LocalDateTime requestCreationTime;
	
	@Column(name = "clientname")
	private String clientName;
	
	@Column(name = "clientrequestid")
	private String clientRequestId;
	
	@Column(name = "clienttaskid")
	private String clientTaskId;
	
	@Column(name = "clienttraceid")
	private String clientTraceId;
	
	@Column(name = "lookupids")
	private String lookupIds;
	
	@Column(name = "formdata")
	private String formData;
	
	@Column(name = "dateadded")
	private LocalDateTime dateAdded;

	public Integer getMasterRequestId() {
		return masterRequestId;
	}

	public void setMasterRequestId(Integer masterRequestId) {
		this.masterRequestId = masterRequestId;
	}

	public String getRequestSource() {
		return requestSource;
	}

	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
	}

	public String getMasterRequestType() {
		return masterRequestType;
	}

	public void setMasterRequestType(String masterRequestType) {
		this.masterRequestType = masterRequestType;
	}

	public LocalDateTime getRequestCreationTime() {
		return requestCreationTime;
	}

	public void setRequestCreationTime(LocalDateTime requestCreationTime) {
		this.requestCreationTime = requestCreationTime;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientRequestId() {
		return clientRequestId;
	}

	public void setClientRequestId(String clientRequestId) {
		this.clientRequestId = clientRequestId;
	}

	public String getClientTaskId() {
		return clientTaskId;
	}

	public void setClientTaskId(String clientTaskId) {
		this.clientTaskId = clientTaskId;
	}

	public String getClientTraceId() {
		return clientTraceId;
	}

	public void setClientTraceId(String clientTraceId) {
		this.clientTraceId = clientTraceId;
	}

	public String getLookupIds() {
		return lookupIds;
	}

	public void setLookupIds(String lookupIds) {
		this.lookupIds = lookupIds;
	}

	public String getFormData() {
		return formData;
	}

	public void setFormData(String formData) {
		this.formData = formData;
	}

	public LocalDateTime getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(LocalDateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	@Override
	public String toString() {
		return "ServiceNowRequest [masterRequestId=" + masterRequestId + ", requestSource=" + requestSource
				+ ", masterRequestType=" + masterRequestType + ", requestCreationTime=" + requestCreationTime
				+ ", clientName=" + clientName + ", clientRequestId=" + clientRequestId + ", clientTaskId="
				+ clientTaskId + ", clientTraceId=" + clientTraceId + ", lookupIds=" + lookupIds + ", formData="
				+ formData + ", dateAdded=" + dateAdded + "]";
	}

	
}