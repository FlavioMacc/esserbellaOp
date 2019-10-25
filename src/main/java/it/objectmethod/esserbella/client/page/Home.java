package it.objectmethod.esserbella.client.page;

import com.google.gwt.user.client.ui.RootPanel;

import it.objectmethod.esserbella.client.view.HeaderView;
import it.objectmethod.esserbella.client.view.OperatoreAddView;
import it.objectmethod.esserbella.client.view.PresenzaAddView;

public class Home {
	
	public void viewHomePage() {

		RootPanel.get().clear();

		RootPanel.get().add(new HeaderView());
		RootPanel.get().add(new OperatoreAddView());
		//RootPanel.get().add(new PresenzaAddView());
	}

}
