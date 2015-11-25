package edu.ifg.formosa.esof.principal.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.esof.principal.client.event.AlterarExcluirEvent;
import edu.ifg.formosa.esof.principal.client.event.AlterarExcluirEventHandler;
import edu.ifg.formosa.esof.principal.client.event.CadastrarContatoEvent;
import edu.ifg.formosa.esof.principal.client.event.CadastrarContatoEventHandler;
import edu.ifg.formosa.esof.principal.client.event.HomeEvent;
import edu.ifg.formosa.esof.principal.client.event.HomeEventHandler;
import edu.ifg.formosa.esof.principal.client.presenter.AlterarExcluirContatoPresenter;
import edu.ifg.formosa.esof.principal.client.presenter.CadastrarNovoContatoPresenter;
import edu.ifg.formosa.esof.principal.client.presenter.PainelPesquisarPresenter;
import edu.ifg.formosa.esof.principal.client.presenter.Presenter;
import edu.ifg.formosa.esof.principal.client.presenter.PainelTabelaeBotaoPresenter;
import edu.ifg.formosa.esof.principal.client.view.AlterarExcluirContatoView;
import edu.ifg.formosa.esof.principal.client.view.CadastrarNovoContatoView;
import edu.ifg.formosa.esof.principal.client.view.PainelPesquisarView;
import edu.ifg.formosa.esof.principal.client.view.PainelTabelaeBotaoView;

public class AppController implements Presenter, ValueChangeHandler<String >{
	
	
	private HasWidgets partedecima;
	private HasWidgets partedebaixo;
	private final HandlerManager eventBus;
	
	public AppController(HandlerManager eventBus){
		 this.eventBus = eventBus;
		 bind();
	}

	public void bind(){
		
		History.addValueChangeHandler(this);
		
		eventBus.addHandler(CadastrarContatoEvent.TYPE, new CadastrarContatoEventHandler() {
			
			@Override
			public void cadastrarContato(CadastrarContatoEvent event) {
				if("".equals(History.getToken())){
					History.newItem("home");
				}
				if("home".equals(History.getToken())){
					History.newItem("cadastrarNovoContato");
				}
				else{
					History.fireCurrentHistoryState();
				}
			}
		});
		eventBus.addHandler(HomeEvent.TYPE, new HomeEventHandler() {
			
			@Override
			public void irHome(HomeEvent event) {
				if("".equals(History.getToken())){
					History.newItem("cadastrarNovoContato");
				}
				if("cadastrarNovoContato".equals(History.getToken())){
					History.newItem("home");
				}
				else{
					History.fireCurrentHistoryState();
				}
			}
		});
		eventBus.addHandler(AlterarExcluirEvent.TYPE, new AlterarExcluirEventHandler() {
			
			@Override
			public void alterarExcluir(AlterarExcluirEvent event) {
				if("".equals(History.getToken())){
					History.newItem("alterarContato");
				}
				if("alterarContato".equals(History.getToken())){
					History.newItem("home");
				}
				else{
					History.fireCurrentHistoryState();
				}
			}
		});
	}
	@Override
	public void onValueChange(ValueChangeEvent<String> event) {
		String token = event.getValue();
		
		Presenter presenter = null;
		
		if(token.equals("home")){
			PainelTabelaeBotaoView tiv = new PainelTabelaeBotaoView();
			PainelTabelaeBotaoPresenter tip = new PainelTabelaeBotaoPresenter(tiv, eventBus);
			partedebaixo.clear();
			partedebaixo.add(tiv);
		}
		if(token.equals("cadastrarNovoContato")){
			
			/*AlterarExcluirContatoView aec = new AlterarExcluirContatoView();
			AlterarExcluirContatoPresenter ccp = new AlterarExcluirContatoPresenter(aec, eventBus);
			partedebaixo.clear();
			partedebaixo.add(aec);*/
			
			CadastrarNovoContatoView cnv = new CadastrarNovoContatoView();
			CadastrarNovoContatoPresenter ccp = new CadastrarNovoContatoPresenter(cnv, eventBus);
			partedebaixo.clear();
			partedebaixo.add(cnv);
		}
		
	}

	@Override
	public void go(HasWidgets partedecima , HasWidgets partedebaixo) {
		this.partedecima = partedecima;
		this.partedebaixo = partedebaixo;
		
		PainelPesquisarView ppv = new PainelPesquisarView();
		PainelPesquisarPresenter ppp = new PainelPesquisarPresenter(ppv, eventBus);
		partedecima.add(ppv);
		
		PainelTabelaeBotaoView tiv = new PainelTabelaeBotaoView();
		PainelTabelaeBotaoPresenter tip = new PainelTabelaeBotaoPresenter(tiv, eventBus);
		partedebaixo.add(tiv);
		
	}

	

}
