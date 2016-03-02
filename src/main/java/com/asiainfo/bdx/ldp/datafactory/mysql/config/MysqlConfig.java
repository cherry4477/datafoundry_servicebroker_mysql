package com.asiainfo.bdx.ldp.datafactory.mysql.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
//@EnableMongoRepositories(basePackages = "org.springframework.cloud.servicebroker.mongodb.repository")
public class MysqlConfig {

	@Value("${mysql.host:localhost}")
	private String host;

	@Value("${mysql.port:3306}")
	private int port;

//	@Bean
//	public MongoClient mongoClient() throws UnknownHostException {
//		return new MongoClient(new ServerAddress(host, port));
//	}
	
}
