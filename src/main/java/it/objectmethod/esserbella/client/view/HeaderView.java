package it.objectmethod.esserbella.client.view;

import java.awt.Color;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

import it.objectmethod.esserbella.client.page.Home;
import it.objectmethod.esserbella.client.resources.HeaderViewResources;

public class HeaderView extends Composite {

	private static HeaderViewUiBinder uiBinder = GWT.create(HeaderViewUiBinder.class);

	@UiField(provided = true)
	final HeaderViewResources res;
	
	@UiField
	Anchor a;
	
	@UiField
	HTMLPanel hp;

	@UiTemplate("HeaderView.ui.xml")
	interface HeaderViewUiBinder extends UiBinder<Widget, HeaderView> {
	}
	
	@UiHandler("a")
	void handleClick(ClickEvent e) {
		new Home().viewHomePage();
	}
		
	public HeaderView() {
		this.res = GWT.create(HeaderViewResources.class);
		res.style().ensureInjected();
		initWidget(uiBinder.createAndBindUi(this));
		
		//hp.getElement().getStyle().setBackgroundImage("linear-gradient(top right, #FFFFFF 0%, #AACFEF 100%)");
	}

}
