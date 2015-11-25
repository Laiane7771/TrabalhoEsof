package edu.ifg.formosa.esof.principal.server.dao;



//import java.util.Map.Entry;

import org.neo4j.cypher.ExecutionEngine;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.RelationshipType;
//import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.kernel.impl.util.StringLogger;
import edu.ifg.formosa.esof.principal.client.bd.ConnectionFactory;
import edu.ifg.formosa.esof.principal.shared.Pessoa;

public class PessoaDAO extends ConnectionFactory {
	
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
	
	

}
