package edu.ifg.formosa.esof.principal.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;


public class CadastrarContatoEvent extends GwtEvent<CadastrarContatoEventHandler>{

	public static Type<CadastrarContatoEventHandler> TYPE = new Type<CadastrarContatoEventHandler>();

	public Type<CadastrarContatoEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(CadastrarContatoEventHandler handler){
		handler.cadastrarContato(this);
	}
}