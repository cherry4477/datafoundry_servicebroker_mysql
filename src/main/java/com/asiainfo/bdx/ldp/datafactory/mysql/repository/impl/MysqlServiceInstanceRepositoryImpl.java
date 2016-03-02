package com.asiainfo.bdx.ldp.datafactory.mysql.repository.impl;

import org.springframework.stereotype.Service;

import com.asiainfo.bdx.ldp.datafactory.mysql.model.ServiceInstance;
import com.asiainfo.bdx.ldp.datafactory.mysql.repository.MysqlServiceInstanceRepository;

@Service
public class MysqlServiceInstanceRepositoryImpl implements MysqlServiceInstanceRepository {

	@Override
	public ServiceInstance findOne(String serviceInstanceId) {
		// TODO Auto-generated method stub
		System.err.println("find one:MysqlServiceInstance");
		return null;
	}

	@Override
	public void save(ServiceInstance instance) {
		System.err.println("save：MysqlServiceInstance");
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String serviceInstanceId) {
		System.err.println("delete：MysqlServiceInstance");
		// TODO Auto-generated method stub
	}

}
