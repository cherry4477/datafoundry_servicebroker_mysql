package com.asiainfo.bdx.ldp.datafactory.mysql.repository.impl;

import org.springframework.stereotype.Service;

import com.asiainfo.bdx.ldp.datafactory.mysql.model.ServiceInstanceBinding;
import com.asiainfo.bdx.ldp.datafactory.mysql.repository.MysqlServiceInstanceBindingRepository;

@Service
public class MysqlServiceInstanceBindingRepositoryImpl implements MysqlServiceInstanceBindingRepository {

	@Override
	public ServiceInstanceBinding findOne(String bindingId) {
		System.err.println("find one： MysqlServiceInstanceBinding");
		return null;
	}

	@Override
	public void save(ServiceInstanceBinding binding) {
		System.err.println("save：MysqlServiceInstanceBinding");
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String bindingId) {
		System.err.println("delete:MysqlServiceInstanceBinding");
		// TODO Auto-generated method stub

	}

}
