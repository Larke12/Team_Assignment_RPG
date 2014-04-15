package com.jreale4.RPG.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class MapView extends Composite {

	public MapView() {

		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		layoutPanel.setSize("1080px", "1080px");

		Image image = new Image("rpg/gwt/clean/images/rpg_mapped.png");
		layoutPanel.add(image);
		image.setSize("1920px", "1080px");

		layoutPanel.setWidgetLeftWidth(image, 0.0, Unit.PX, 1920.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(image, 0.0, Unit.PX, 1080.0, Unit.PX);
		
		Button btnOcean = new Button("Ocean");
		btnOcean.setStyleName("mapButton");
		layoutPanel.add(btnOcean);
		layoutPanel.setWidgetLeftWidth(btnOcean, 45.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnOcean, 701.0, Unit.PX, 28.0, Unit.PX);
		
		Button btnSiara = new Button("Sahara");
		btnSiara.setStyleName("mapButton");
		btnSiara.setText("Sahara");
		layoutPanel.add(btnSiara);
		layoutPanel.setWidgetLeftWidth(btnSiara, 301.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnSiara, 724.0, Unit.PX, 28.0, Unit.PX);
		
		Button btnMtVilla = new Button("Mt. Villa");
		btnMtVilla.setStyleName("mapButton");
		layoutPanel.add(btnMtVilla);
		layoutPanel.setWidgetLeftWidth(btnMtVilla, 215.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnMtVilla, 195.0, Unit.PX, 28.0, Unit.PX);
		
		Button btnYorkWoods = new Button("York Woods");
		btnYorkWoods.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// Go to BattleView
			}
		});
		btnYorkWoods.setStyleName("mapButton");
		layoutPanel.add(btnYorkWoods);
		layoutPanel.setWidgetLeftWidth(btnYorkWoods, 441.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnYorkWoods, 530.0, Unit.PX, 46.0, Unit.PX);
		
		Button btnYorkShrine = new Button("York Shrine");
		btnYorkShrine.setStyleName("mapButton");
		layoutPanel.add(btnYorkShrine);
		layoutPanel.setWidgetLeftWidth(btnYorkShrine, 880.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnYorkShrine, 520.0, Unit.PX, 46.0, Unit.PX);

	}
}
