package it.objectmethod.esserbella.client.rest;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("esserbellaRest")
public interface EsserbellaResource extends RemoteService{
	
    void insertOperatore(String nome);

}
