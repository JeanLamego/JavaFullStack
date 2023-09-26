package persistence;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Dao {
	

	private MongoClient client;
	
	public MongoClient getClient() {
		client = new MongoClient();
		return client;
	}
	public MongoDatabase getDB() throws Exception{
		return getClient().getDatabase("bdmongo");
	}
	public void close() throws Exception{
		client.close();
	}
}
