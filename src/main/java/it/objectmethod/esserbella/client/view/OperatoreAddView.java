package it.objectmethod.esserbella.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
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
	Label titlePage;

	@UiField
	Label nomeOpLabel;

	@UiField
	TextBox nomeOpTextBox;
	
	@UiField
	VerticalPanel vp;

	@UiField
	Button button;
	
	@UiField
	Button viewAllOp;
	
	@UiChild

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
	
	@UiHandler("viewAllOp")
	void handleClick1(ClickEvent e) {
		RootPanel.get().clear();
		RootPanel.get().add(new HeaderView());
		
	}

	public OperatoreAddView() {
		this.res = GWT.create(OperatoreAddViewResources.class);
		res.style().ensureInjected();
		initWidget(uiBinder.createAndBindUi(this));
		
		
		button.getElement().getStyle().setMarginTop(10.0,Unit.PX);
		button.getElement().getStyle().setBackgroundColor("#13547a");
		button.getElement().getStyle().setColor("white");
		
		viewAllOp.getElement().getStyle().setMarginTop(10.0,Unit.PX);
		viewAllOp.getElement().getStyle().setBackgroundColor("#13547a");
		viewAllOp.getElement().getStyle().setColor("white");
	}

}
