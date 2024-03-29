package it.objectmethod.esserbella.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface PresenzaAddViewResources extends ClientBundle {

	public interface MyCss extends CssResource {
		String blackText();

		String marginEl();
	}

	@Source("PresenzaAddView.css")
	MyCss style();

}
