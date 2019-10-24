package it.objectmethod.esserbella.client;

import com.google.gwt.core.client.EntryPoint;

import it.objectmethod.esserbella.client.page.Home;

public class Esserbella implements EntryPoint {

	public void onModuleLoad() {
		
		new Home().viewHomePage();
		
	}
}
