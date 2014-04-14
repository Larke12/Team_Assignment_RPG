package com.jreale4.RPG.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.dom.client.Style.Unit;

public class MapView extends Composite {

	public MapView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		
		Image image = new Image((String) null);
		layoutPanel.add(image);
		layoutPanel.setWidgetLeftWidth(image, 0.0, Unit.PX, 100.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, 0.0, Unit.PX, 100.0, Unit.PX);
		
	}
}
