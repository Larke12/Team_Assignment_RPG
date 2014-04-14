package com.jreale4.RPG.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class RPG implements EntryPoint {
	private static IsWidget currentView;
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		IsWidget view = new LoginView();
		
		setView(view);
	}

	/**
	 * Set the current view.
	 * 
	 * @param view the view to set
	 */
	public static void setView(IsWidget view) {
		if (currentView != null) {
			RootLayoutPanel.get().remove(currentView);
		}
		
		RootLayoutPanel.get().add(view);
		RootLayoutPanel.get().setWidgetLeftRight(view, 0.0, Unit.PX, 0.0, Unit.PX);
		RootLayoutPanel.get().setWidgetTopBottom(view, 0.0, Unit.PX, 0.0, Unit.PX);
		currentView = view;
	}
}
