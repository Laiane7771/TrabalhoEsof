package edu.ifg.formosa.esof.principal.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.esof.principal.client.event.HomeEvent;
import edu.ifg.formosa.esof.principal.client.view.AlterarExcluirContatoView;

public class AlterarExcluirContatoPresenter implements Presenter{
	
	private AlterarExcluirContatoView aecv;
	private final HandlerManager eventBus;
	
	public AlterarExcluirContatoPresenter(AlterarExcluirContatoView aecv, HandlerManager eventBus){
		this.aecv = aecv;
		this.eventBus = eventBus;
		bind();
	}

	public void bind(){
		aecv.getBtnSalvar().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		
		aecv.getBtnVoltar().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new HomeEvent());
				
			}
		});
		
		aecv.getBtnExcluir().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	@Override
	public void go(HasWidgets partedecima, HasWidgets partedebaixo) {
		
		
	}

}
