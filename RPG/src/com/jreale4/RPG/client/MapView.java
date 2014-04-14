package com.jreale4.RPG.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Button;

public class MapView extends Composite {

	public MapView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		
		Image image = new Image("rpg/gwt/clean/images/rpg_mapped.png");
		layoutPanel.add(image);
		// Does nothing
		image.setSize("1920", "1080");
		
		layoutPanel.setWidgetLeftWidth(image, 0.0, Unit.PX, 1920.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, 0.0, Unit.PX, 1080.0, Unit.PX);
		
		Button btnNewButton = new Button("New button");
		btnNewButton.setVisible(false);
		layoutPanel.add(btnNewButton);
		layoutPanel.setWidgetLeftWidth(btnNewButton, 166.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnNewButton, 118.0, Unit.PX, 28.0, Unit.PX);
		
	}
}
