package edu.ifg.formosa.esof.principal.client.presenter;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.esof.principal.client.event.CadastrarContatoEvent;
import edu.ifg.formosa.esof.principal.client.view.PainelTabelaeBotaoView;
import edu.ifg.formosa.esof.principal.shared.Pessoa;

public class PainelTabelaeBotaoPresenter implements Presenter {
	
	private PainelTabelaeBotaoView tiv;
	private final HandlerManager eventBus;
	private Pessoa pessoa;
	
	
	public PainelTabelaeBotaoPresenter(PainelTabelaeBotaoView tiv, HandlerManager eventBus){
		this.tiv = tiv;
		this.eventBus = eventBus;
		criaTituloTabela();
		bind();
	}
	
	public void bind(){
		tiv.getBtnCadastrarNovo().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new CadastrarContatoEvent());
			}
		});
		
		tiv.getFtTabelaContatos().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
			}
		});
		
	}

	@Override
	public void go(HasWidgets partedecima, HasWidgets partedebaixo) {
		partedebaixo.add(tiv.asWidget());
		bind();
		
	}
	
	
	public void criaTituloTabela(){
		tiv.getFtTabelaContatos().setWidget(0, 0, tiv.getTftNome());
		tiv.getFtTabelaContatos().setWidget(0, 1, tiv.getTftApelido());
		tiv.getFtTabelaContatos().setWidget(0, 2, tiv.getTftTelefone());
		tiv.getFtTabelaContatos().setWidget(0, 3, tiv.getTftEmail());
		tiv.getFtTabelaContatos().setWidget(0, 4, tiv.getTftDataNasci());
		tiv.getFtTabelaContatos().setWidget(0, 5, tiv.getTftRedesSociais());
	}

	public void preencheTabela(){
		
		tiv.getFtTabelaContatos().clear(true);
		tiv.getFtTabelaContatos().removeAllRows();
		
		
	
		
	}
	
	/*
	 * public void preencheTabela(Vector<Vector<String>> listaEventos){
		vle.getTableListaEvento().clearSelection();
		vle.getTableListaEvento().removeAll();
	
		Vector<String> colunas = new Vector<String>();
		colunas.add("id");
		colunas.add("Nome");
		colunas.add("Evento");

		DefaultTableModel model = new DefaultTableModel(listaEventos, colunas);
		vle.getTableListaEvento().setModel(model);
		vle.getTableListaEvento().getColumn("id").setMaxWidth(25);
	}
	 * */
	
 	
}
