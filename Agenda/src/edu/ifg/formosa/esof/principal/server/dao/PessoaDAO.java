package edu.ifg.formosa.esof.principal.server.dao;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import org.neo4j.cypher.ExecutionEngine;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.kernel.impl.util.StringLogger;

import com.ibm.icu.text.SimpleDateFormat;

import edu.ifg.formosa.esof.principal.server.ConnectionFactory;
import edu.ifg.formosa.esof.principal.shared.Pessoa;

public class PessoaDAO extends ConnectionFactory {
	
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	Date d = new Date();
	public enum NodeType implements Label {
		Pessoa;
	}

	public enum RelationType implements RelationshipType {
		Conhece;
	}
	

	private static PessoaDAO instance;

	public static PessoaDAO getInstance() {
		if (instance == null)
			instance = new PessoaDAO();
		return instance;
	}

	public void save(Pessoa pessoa) throws Exception {
		ConnectionFactory connectionFactory = new ConnectionFactory();

		GraphDatabaseService graphDatabaseService = connectionFactory
				.openConnection();
		//Verificar
		ExecutionEngine executionEngine = new ExecutionEngine(
				graphDatabaseService, StringLogger.SYSTEM);

		try (Transaction tx = graphDatabaseService.beginTx()) {

			//executionEngine.execute("match (n) optional match (n)-[r]-() delete n,r");

			Node pessoaNode = graphDatabaseService.createNode(NodeType.Pessoa);
			
			pessoaNode.setProperty("Nome", pessoa.getNome());
			pessoaNode.setProperty("apelido", pessoa.getApelido());
			pessoaNode.setProperty("telefone", pessoa.getTelefone());
			pessoaNode.setProperty("email", pessoa.getEmail());
			//pessoaNode.setProperty("dataNascimento",pessoa.getDataNascimento());
			pessoaNode.setProperty("facebook", pessoa.getFacebook());
			pessoaNode.setProperty("twiter", pessoa.getTwiter());
			pessoaNode.setProperty("instagram", pessoa.getInstagram());
			pessoaNode.setProperty("github", pessoa.getGithub());
			//SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
			//pessoaNode.setProperty("dataNascimento", sd.format(pessoa.getDataNascimento()));
			
			tx.success();
		}

	}

	public void createRelasshionship(Pessoa pessoa1, Pessoa pessoa2)
			throws Exception {
		ConnectionFactory connectionFactory = new ConnectionFactory();

		GraphDatabaseService graphDatabaseService = connectionFactory
				.openConnection();

		ExecutionEngine executionEngine = new ExecutionEngine(
				graphDatabaseService, StringLogger.SYSTEM);

		try (Transaction tx = graphDatabaseService.beginTx()) {

			Node pessoa1Node = graphDatabaseService.findNode(NodeType.Pessoa,
					"Id", 1);
			Node pessoa2Node = graphDatabaseService.findNode(NodeType.Pessoa,
					"Id", 2);

			pessoa1Node.createRelationshipTo(pessoa2Node, RelationType.Conhece);

			tx.success();
		}

	}
	
	
	public ArrayList<Pessoa> listaPessoa(){
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Aldenice Alves");
		pessoa.setApelido("nicy");
		pessoa.setEmail("ald.nicyy323@gmail.com");
		try {
			d = formato.parse("25/06/1996");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		formato.format(d);
		pessoa.setDataNascimento(d);
		pessoa.setFacebook("http://www.facebook.com.br/aldenicealves");
		pessoa.setGithub("http://www.");
		
		return null;
	}

}
