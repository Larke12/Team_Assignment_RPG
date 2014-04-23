package com.jreale4.RPG.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.DoubleClickHandler;
import com.google.gwt.event.dom.client.DoubleClickEvent;

public class BattleView extends Composite {
	
	//IsWidget iView = new InView();
	IsWidget mView = new MapView();

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
		layoutPanel.setWidgetLeftWidth(btnAttack, 299.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnAttack, 423.0, Unit.PX, 28.0, Unit.PX);
		
		Button btnInventory = new Button("Inventory");
		btnInventory.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// Open Inventory View
				//RPG.setView(InView);
			}
		});
		layoutPanel.add(btnInventory);
		layoutPanel.setWidgetLeftWidth(btnInventory, 409.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnInventory, 423.0, Unit.PX, 28.0, Unit.PX);
		
		Button btnEscape = new Button("Escape!");
		btnEscape.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// Random counter, if < 1 does nothing; if > 1 goes back to map
				RPG.setView(mView);
			}
		});
		layoutPanel.add(btnEscape);
		layoutPanel.setWidgetLeftWidth(btnEscape, 409.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnEscape, 473.0, Unit.PX, 28.0, Unit.PX);
		
		Button btnMagica = new Button("Magica");
		btnMagica.addDoubleClickHandler(new DoubleClickHandler() {
			public void onDoubleClick(DoubleClickEvent event) {
				// Use last used magic attack
			}
		});
		btnMagica.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// Open selection of images, current view
			}
		});
		layoutPanel.add(btnMagica);
		layoutPanel.setWidgetLeftWidth(btnMagica, 299.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnMagica, 473.0, Unit.PX, 28.0, Unit.PX);
		
		Image image = new Image("rpg/gwt/clean/images/enemy_x.png");
		layoutPanel.add(image);
		layoutPanel.setWidgetLeftWidth(image, 187.0, Unit.PX, 340.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, 141.0, Unit.PX, 156.0, Unit.PX);
		
	}
}
