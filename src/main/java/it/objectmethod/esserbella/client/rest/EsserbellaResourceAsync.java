package it.objectmethod.esserbella.client.rest;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface EsserbellaResourceAsync {
	
    void insertOperatore(String nome, AsyncCallback<Void> callback);

}
