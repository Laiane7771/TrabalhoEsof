package edu.ifg.formosa.esof.principal.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.esof.principal.client.event.HomeEvent;
import edu.ifg.formosa.esof.principal.client.view.CadastrarNovoContatoView;

public class CadastrarNovoContatoPresenter implements Presenter{

	private CadastrarNovoContatoView cvn;
	private final HandlerManager eventBus;
	
	public CadastrarNovoContatoPresenter(CadastrarNovoContatoView cvn, HandlerManager eventBus){
		this.cvn = cvn;
		this.eventBus = eventBus;
		bind();
		
	}

	public void bind(){
		
		cvn.getBtnVoltar().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new HomeEvent());
				
			}
		});
		
		cvn.getBtnSalvar().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				
			}
		});
		
	}
	@Override
	public void go(HasWidgets partedecima, HasWidgets partedebaixo) {
		partedecima.add(cvn.asWidget());
		bind();
		
	}
	
}
