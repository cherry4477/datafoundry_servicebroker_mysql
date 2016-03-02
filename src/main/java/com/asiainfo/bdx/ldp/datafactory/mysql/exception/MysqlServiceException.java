package com.asiainfo.bdx.ldp.datafactory.mysql.exception;

import org.springframework.cloud.servicebroker.exception.ServiceBrokerException;


/**
 * Exception thrown when issues with the underlying mongo service occur.
 * NOTE: com.mongodb.MongoException is a runtime exception and therefore we 
 * want to have to handle the issue.
 * 
 * @author sgreenberg@pivotal.io
 *
 */
public class MysqlServiceException extends ServiceBrokerException {

	private static final long serialVersionUID = 8667141725171626000L;

	public MysqlServiceException(String message) {
		super(message);
	}
	
}
