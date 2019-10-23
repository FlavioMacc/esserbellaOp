package it.objectmethod.esserbella.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

import it.objectmethod.esserbella.client.view.OperatoreAddView;
import it.objectmethod.esserbella.client.view.PresenzaAddView;

public class Esserbella implements EntryPoint {

	public void onModuleLoad() {
		RootPanel.get().add(new OperatoreAddView());
		RootPanel.get().add(new PresenzaAddView());
	}
}
