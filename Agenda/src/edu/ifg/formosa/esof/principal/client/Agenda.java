package edu.ifg.formosa.esof.principal.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;


public class Agenda implements EntryPoint {
	
	
	public void onModuleLoad() {
			
		HandlerManager eventBus = new HandlerManager(null);
		AppController ac = new AppController(eventBus);
		ac.go(RootPanel.get("partedecima"), RootPanel.get("partedebaixo"));
		
		/*PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscaPessoa("Aldenice");
		GWT.log(pessoa.getNome());
		
		//Date d = new Date();
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Aldenice Alves Bispo");
		pessoa1.setApelido("Nice");
		pessoa1.setTelefone("99666544");
		pessoa1.setEmail("ald.nicy323@gmail.com");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//try {
		//	d = sdf.parse("25/06/1996");
	//	} catch (ParseException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
	//	}
	//	sdf.format(d);
		pessoa1.setDataNascimento(d);
		pessoa1.setFacebook("https://www.facebook.com/aldenicealves.aldenice");
		pessoa1.setTwiter("twiter.com/aldenice");
		pessoa1.setInstagram("instagram.com/aldenyce");
		pessoa1.setGithub("github.com/aldenyce");
		
		try {
			PessoaDAO pdao = new PessoaDAO();
			pdao.save(pessoa1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
	}
}
