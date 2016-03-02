package com.asiainfo.bdx.ldp.datafactory.mysql.repository;

import com.asiainfo.bdx.ldp.datafactory.mysql.model.ServiceInstance;

/**
 * Repository for ServiceInstance objects
 * 
 * @author sgreenberg@pivotal.io
 *
 */
public interface MysqlServiceInstanceRepository  {

	ServiceInstance findOne(String serviceInstanceId);
	
	void save(ServiceInstance instance);
	
	void delete(String serviceInstanceId);
}