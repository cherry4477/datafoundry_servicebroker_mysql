package com.asiainfo.bdx.ldp.datafactory.mysql.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.servicebroker.model.Catalog;
import org.springframework.cloud.servicebroker.model.Plan;
import org.springframework.cloud.servicebroker.model.ServiceDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CatalogConfig {
	
	@Bean
	public Catalog catalog() {
		return new Catalog(Collections.singletonList(
				new ServiceDefinition(
						"msyql-service-broker",
						"Mysql",
						"A simple mysqlDb service broker implementation",
						true,
						false,
						Collections.singletonList(
								new Plan("mysql-plan",
										"Default mysql Plan",
										"This is a default mysql plan.  All services are created equally.",
										getPlanMetadata())),
						Arrays.asList("mysql", "document"),
						getServiceDefinitionMetadata(),
						null,
						null)));
	}
	
/* Used by Pivotal CF console */

	private Map<String, Object> getServiceDefinitionMetadata() {
		Map<String, Object> sdMetadata = new HashMap<>();
		sdMetadata.put("displayName", "Mysql");
		sdMetadata.put("imageUrl", "http://info.mysql.com/rs/mongodb/images/MongoDB_Logo_Full.png");
		sdMetadata.put("longDescription", "Mysql Service");
		sdMetadata.put("providerDisplayName", "Pivotal");
		sdMetadata.put("documentationUrl", "https://github.com/spring-cloud-samples/cloudfoundry-mongodb-service-broker");
		sdMetadata.put("supportUrl", "https://github.com/spring-cloud-samples/cloudfoundry-mongodb-service-broker");
		return sdMetadata;
	}
	
	private Map<String,Object> getPlanMetadata() {
		Map<String,Object> planMetadata = new HashMap<>();
		planMetadata.put("costs", getCosts());
		planMetadata.put("bullets", getBullets());
		return planMetadata;
	}

	private List<Map<String,Object>> getCosts() {
		Map<String,Object> costsMap = new HashMap<>();
		
		Map<String,Object> amount = new HashMap<>();
		amount.put("usd", 0.0);
	
		costsMap.put("amount", amount);
		costsMap.put("unit", "MONTHLY");
		
		return Collections.singletonList(costsMap);
	}
	
	private List<String> getBullets() {
		return Arrays.asList("Shared MongoDB server", 
				"100 MB Storage (not enforced)", 
				"40 concurrent connections (not enforced)");
	}
	
}