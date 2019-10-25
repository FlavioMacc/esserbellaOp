package it.objectmethod.esserbella.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface HeaderViewResources extends ClientBundle{
	
	public interface MyCss extends CssResource {

	   }
	
	@Source("HeaderView.css")
	MyCss style();

}
