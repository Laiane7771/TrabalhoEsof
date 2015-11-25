package edu.ifg.formosa.esof.principal.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;

public class AlterarExcluirEvent extends GwtEvent<AlterarExcluirEventHandler>{

	public static Type<AlterarExcluirEventHandler> TYPE = new Type<AlterarExcluirEventHandler>();

	public Type<AlterarExcluirEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(AlterarExcluirEventHandler handler){
		handler.alterarExcluir(this);
	}
}
