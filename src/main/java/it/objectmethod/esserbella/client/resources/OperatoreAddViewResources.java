package it.objectmethod.esserbella.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface OperatoreAddViewResources extends ClientBundle {

	public interface MyCss extends CssResource {
		String title();
		String style();
	}

	@Source("OperatoreAddView.css")
	MyCss style();
}
