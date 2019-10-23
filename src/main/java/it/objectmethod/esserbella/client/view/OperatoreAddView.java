package it.objectmethod.esserbella.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import it.objectmethod.esserbella.client.resources.OperatoreAddViewResources;
import it.objectmethod.esserbella.client.rest.EsserbellaResource;
import it.objectmethod.esserbella.client.rest.EsserbellaResourceAsync;

public class OperatoreAddView extends Composite {

	private static OperatoreAddViewUiBinder uiBinder = GWT.create(OperatoreAddViewUiBinder.class);

	private final EsserbellaResourceAsync service = GWT.create(EsserbellaResource.class);

	@UiTemplate("OperatoreAddView.ui.xml")
	interface OperatoreAddViewUiBinder extends UiBinder<Widget, OperatoreAddView> {
	}

	@UiField(provided = true)
	final OperatoreAddViewResources res;

	@UiField
	Label nomeOpLabel;

	@UiField
	TextBox nomeOpTextBox;

	@UiField
	FormPanel form;

	@UiField
	Button button;

	@UiHandler("button")
	void handleClick(ClickEvent e) {
		
		String nome = nomeOpTextBox.getValue();
		service.insertOperatore(nome, new AsyncCallback<Void>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert("fallito");
			}

			@Override
			public void onSuccess(Void result) {
				Window.alert("inserito");
			}
		});
	}

	public OperatoreAddView() {
		this.res = GWT.create(OperatoreAddViewResources.class);
		res.style().ensureInjected();
		initWidget(uiBinder.createAndBindUi(this));

		/*form.setAction("esserbellaRest/insertOperatore");
		form.setEncoding(FormPanel.ENCODING_URLENCODED);
		form.setMethod(FormPanel.METHOD_POST);*/

	}

}
