package com.asiainfo.bdx.ldp.datafactory.mysql.service;

import java.sql.Connection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.asiainfo.bdx.ldp.datafactory.mysql.exception.MysqlServiceException;

/**
 * Utility class for manipulating a Mongo database.
 * 
 * @author sgreenberg@pivotal.io
 *
 */
@Service
public class MysqlAdminService {

	public static final String ADMIN_DB = "admin";
	
	private Logger logger = LoggerFactory.getLogger(MysqlAdminService.class);
	
//	private MongoClient client;
//	
//	@Autowired
//	public MysqlAdminService(MongoClient client) {
//		this.client = client;
//	}
	
	public boolean databaseExists(String databaseName) throws MysqlServiceException {
//		try {
//			return client.getDatabaseNames().contains(databaseName);
//		} catch (MongoException e) {
//			throw handleException(e);
//		}
		//TODO
		return false;
	}
	
	public void deleteDatabase(String databaseName) throws MysqlServiceException {
//		try{
//			client.getDB(ADMIN_DB);
//			client.dropDatabase(databaseName);
//		} catch (MongoException e) {
//			throw handleException(e);
//		}
	}
	
	public Connection createDatabase(String databaseName) throws MysqlServiceException {
//		try {
//			DB db = client.getDB(databaseName);
//			
//			// save into a collection to force DB creation.
//			DBCollection col = db.createCollection("foo", null);
//			BasicDBObject obj = new BasicDBObject();
//			obj.put("foo", "bar");
//			col.insert(obj);
//			// drop the collection so the db is empty
////			col.drop();
//			
//			return db; 
//		} catch (MongoException e) {
//			// try to clean up and fail
//			try {
//				deleteDatabase(databaseName);
//			} catch (MysqlServiceException ignore) {}
//			throw handleException(e);
//		}
		//TODO
		return null;
	}
	
	public void createUser(String database, String username, String password) throws MysqlServiceException {
//		try {
//			DB db = client.getDB(database);
//			BasicDBList roles = new BasicDBList();
//			roles.add("readWrite");
//			DBObject command = BasicDBObjectBuilder
//					.start("createUser", username)
//					.add("pwd", password)
//					.add("roles", roles)
//					.get();
//			CommandResult result = db.command(command);
//			if (!result.ok()) {
//				MysqlServiceException e = new MysqlServiceException(result.toString());
//				logger.warn(e.getLocalizedMessage());
//				throw e;
//			}
//		} catch (MongoException e) {
//			throw handleException(e);
//		}
	}
	
	public void deleteUser(String database, String username) throws MysqlServiceException {
//		try {
//			DB db = client.getDB(database);
//			db.command(new BasicDBObject("dropUser", username));
//		} catch (MongoException e) {
//			throw handleException(e);
//		}
	}
	
	public String getConnectionString(String database, String username, String password) {
		return new StringBuilder()
				.append("mysql://")
				.append(username)
				.append(":")
				.append(password)
				.append("@")
				.append(getServerAddresses())
				.append("/")
				.append(database)
				.toString();
	}
	
	public String getServerAddresses() {
//		StringBuilder builder = new StringBuilder();
//		for (ServerAddress address : client.getAllAddress()) {
//			builder.append(address.getHost())
//					.append(":")
//					.append(address.getPort())
//					.append(",");
//		}
//		if (builder.length() > 0) {
//			builder.deleteCharAt(builder.length()-1);
//		}
//		return builder.toString();
		//TODO
		return "";
	}
	
	private MysqlServiceException handleException(Exception e) {
		logger.warn(e.getLocalizedMessage(), e);
		return new MysqlServiceException(e.getLocalizedMessage());
	}
	
}
