package com.jreale4.RPG.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class BattleView extends Composite {

	public BattleView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("800px", "800px");
		
		Button btnAttack = new Button("Attack!");
		btnAttack.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// Slash! Physical attack only.
			}
		});
		layoutPanel.add(btnAttack);
		layoutPanel.setWidgetLeftWidth(btnAttack, 490.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnAttack, 365.0, Unit.PX, 28.0, Unit.PX);
		
		Button btnInventory = new Button("Inventory");
		layoutPanel.add(btnInventory);
		layoutPanel.setWidgetLeftWidth(btnInventory, 600.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnInventory, 365.0, Unit.PX, 28.0, Unit.PX);
		
		Button btnEscape = new Button("Escape!");
		layoutPanel.add(btnEscape);
		layoutPanel.setWidgetLeftWidth(btnEscape, 600.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnEscape, 415.0, Unit.PX, 28.0, Unit.PX);
		
		Button btnMagica = new Button("Magica");
		layoutPanel.add(btnMagica);
		layoutPanel.setWidgetLeftWidth(btnMagica, 490.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnMagica, 415.0, Unit.PX, 28.0, Unit.PX);
		
		Image image = new Image("rpg/gwt/clean/images/character_skew.png");
		layoutPanel.add(image);
		layoutPanel.setWidgetLeftWidth(image, 0.0, Unit.PX, 100.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, 0.0, Unit.PX, 100.0, Unit.PX);
		
	}
}
