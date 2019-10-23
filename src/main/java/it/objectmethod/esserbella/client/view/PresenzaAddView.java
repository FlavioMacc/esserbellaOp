package it.objectmethod.esserbella.client.view;

import javax.inject.Inject;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import it.objectmethod.esserbella.client.resources.PresenzaAddViewResources;
import it.objectmethod.esserbella.client.rest.EsserbellaResource;

public class PresenzaAddView extends Composite {

	private static PresenzaAddViewUiBinder uiBinder = GWT.create(PresenzaAddViewUiBinder.class);
	
	@Inject
	private EsserbellaResource es;

	@UiTemplate("PresenzaAddView.ui.xml")
	interface PresenzaAddViewUiBinder extends UiBinder<Widget, PresenzaAddView> {
	}

	@UiField(provided = true)
	final PresenzaAddViewResources res;

	@UiField
	Label dataLabel;

	@UiField
	TextBox dataInizio;
	
	@UiField
	TextBox dataFine;
	
	@UiField
	TextBox idOperatore;
	
	@UiHandler("submit")
	void doClickSubmit(ClickEvent event) {
		Window.alert(" data inserita e -> "+ dataInizio.getValue() + " a " + dataFine.getValue());
	}
	
	/*@UiHandler("nomeOpTextBox")
	   void handleNomeOpChange(ValueChangeEvent<String> event) {
		 if (event.getValue().length() < 6) {
			 Window.alert("Login too short (Size must be > 6)");
	      } else {
	         Window.alert("ok");
	      }
	   }*/

	public PresenzaAddView() {
		this.res = GWT.create(PresenzaAddViewResources.class);
		res.style().ensureInjected();
		initWidget(uiBinder.createAndBindUi(this));
	}

}
