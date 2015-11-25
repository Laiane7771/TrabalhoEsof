package edu.ifg.formosa.esof.principal.client.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.esof.principal.client.view.PainelPesquisarView;

public class PainelPesquisarPresenter implements Presenter {

	private PainelPesquisarView ppv;
	private final HandlerManager eventBus;
	
	public PainelPesquisarPresenter(PainelPesquisarView ppv, HandlerManager eventBus){
		this.ppv = ppv;
		this.eventBus = eventBus;
		bind();
	}
	
	public void bind(){
		
		ppv.getBtnPesquisar().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				
			}
		});
		
	}
	@Override
	public void go(HasWidgets partedecima, HasWidgets partedebaixo) {
		partedecima.add(ppv.asWidget());
		partedecima.add(null);
		bind();
	}

}
