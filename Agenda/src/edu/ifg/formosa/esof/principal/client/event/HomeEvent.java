package edu.ifg.formosa.esof.principal.client.event;

import com.google.gwt.event.shared.GwtEvent;


public class HomeEvent extends GwtEvent<HomeEventHandler>{

	public static Type<HomeEventHandler> TYPE = new Type<HomeEventHandler>();

	public Type<HomeEventHandler> getAssociatedType(){
		return TYPE;
	}
	protected void dispatch(HomeEventHandler handler){
		handler.irHome(this);
	}

}
