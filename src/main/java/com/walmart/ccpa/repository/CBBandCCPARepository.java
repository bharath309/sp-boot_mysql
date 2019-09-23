package com.walmart.ccpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.walmart.ccpa.entity.ServiceNowRequest;

@Repository
public interface CBBandCCPARepository extends JpaRepository<ServiceNowRequest, String>{

}
