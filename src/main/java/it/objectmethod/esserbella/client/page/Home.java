package it.objectmethod.esserbella.client.page;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
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

		Button btn = new Button("Vedi tutti gli operatori");
		btn.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				RootPanel.get().clear();
				RootPanel.get().add(new HeaderView());
			}
		});

		RootPanel.get().add(btn);
	}

}
