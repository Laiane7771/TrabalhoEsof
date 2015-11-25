package edu.ifg.formosa.esof.principal.server.dao;

import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.RelationshipType;

import edu.ifg.formosa.esof.principal.client.bd.ConnectionFactory;

public class buscaDao extends ConnectionFactory {
	
	public enum NodeType implements Label{
		Pessoa;
	}
	public enum RelationType implements RelationshipType{
		Conhece;
	}
	private static buscaDao instance;
	
	public static buscaDao getInstance(){
		if(instance==null)
			instance = new buscaDao();
		return instance;
	}
	
	

}
