package edu.ifg.formosa.esof.principal.server;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

public class ConnectionFactory {
	
	public static String PATH = "/home/laiane/Downloads/neo4j-community-2.2.7/data/graph.db";

	public GraphDatabaseService openConnection() throws Exception {
		GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
		GraphDatabaseService graphDB = dbFactory.newEmbeddedDatabase(PATH);
		return graphDB;
	}

	public void closeConnection(GraphDatabaseService graphDatabaseService) throws Exception {
		graphDatabaseService.shutdown();
	}
}