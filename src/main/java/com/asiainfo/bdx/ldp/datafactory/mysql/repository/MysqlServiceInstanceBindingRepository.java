package com.asiainfo.bdx.ldp.datafactory.mysql.repository;

import com.asiainfo.bdx.ldp.datafactory.mysql.model.ServiceInstanceBinding;

/**
 * Repository for ServiceInstanceBinding objects
 * 
 * @author sgreenberg@pivotal.io
 *
 */
public interface MysqlServiceInstanceBindingRepository {
	
	ServiceInstanceBinding findOne(String bindingId);
	
	void save(ServiceInstanceBinding binding);
	
	void delete(String bindingId);

	
}
