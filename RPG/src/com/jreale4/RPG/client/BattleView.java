package com.jreale4.RPG.client;

import java.util.Random;

import com.google.gwt.dev.ModuleTabPanel.Session;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DoubleClickEvent;
import com.google.gwt.event.dom.client.DoubleClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueBoxBase.TextAlignment;
import com.jreale4.RPG.shared.Hero;

public class BattleView extends Composite {

	TextBox textBox;

	public BattleView(final Hero hero) {

		LayoutPanel layoutPanel = new LayoutPanel();
		layoutPanel.setStyleName("layoutP");
		initWidget(layoutPanel);
		layoutPanel.setSize("1060px", "800px");

		textBox = new TextBox();
		textBox.setAlignment(TextAlignment.CENTER);
		textBox.setVisibleLength(80);
		textBox.setReadOnly(true);
		textBox.setVisible(false);
		layoutPanel.add(textBox);
		textBox.setSize("400px", "34px");
		layoutPanel.setWidgetRightWidth(textBox, 463.0, Unit.PX, 400.0, Unit.PX);
		layoutPanel.setWidgetBottomHeight(textBox, 207.0, Unit.PX, 34.0, Unit.PX);

		// Health Bar code
		HTML healthDiv = new HTML(
				"<div class=\"health-bar\">" +
						"<div class=\"health-bar-inner\">" +
						"<div id=\"" + getInnerBackgroundElementId() + "\" class=\"health-bar-inner-bg\">" +
						"<div id=\"" + gethealthElementId() + "\" class=\"healt-bar-full-bg\"></div></div></div></div>");
		initWidget(healthDiv);
		healthDiv.setSize("160px", "28px");

		Button btnAttack = new Button("Attack!");
		btnAttack.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {

				AttackRPC.attackService.makeSlash(new AsyncCallback<Integer>(){
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
					}

					public void onSuccess(Integer result) {
						// TODO Auto-generated method stub
						textBox.setText("Dan used Slash! It did " + result + " damage.");
						textBox.setVisible(true);
					}
				});
			}
		});

		layoutPanel.add(btnAttack);
		layoutPanel.setWidgetLeftRight(btnAttack, 299.0, Unit.PX, 680.0, Unit.PX);
		layoutPanel.setWidgetTopBottom(btnAttack, 423.0, Unit.PX, 349.0, Unit.PX);

		Button btnInventory = new Button("Inventory");
		btnInventory.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// Open Inventory View, SAME VIEW accessed via MapView
				//RPG.setView(InView);
			}
		});

		layoutPanel.add(btnInventory);
		layoutPanel.setWidgetLeftRight(btnInventory, 409.0, Unit.PX, 570.0, Unit.PX);
		layoutPanel.setWidgetTopBottom(btnInventory, 423.0, Unit.PX, 349.0, Unit.PX);

		Button btnEscape = new Button("Escape!");
		btnEscape.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Random rand = new Random();
				int cnt = rand.nextInt(10)-2;
				if(cnt > 0){
					RPG.setView(new MapView(hero));
				}
				else{
					textBox.setText("Can't Escape!");
					textBox.setVisible(true);
				}
			}
		});

		layoutPanel.add(btnEscape);
		layoutPanel.setWidgetLeftRight(btnEscape, 409.0, Unit.PX, 570.0, Unit.PX);
		layoutPanel.setWidgetTopBottom(btnEscape, 473.0, Unit.PX, 299.0, Unit.PX);

		Button btnMagica = new Button("Magica");
		btnMagica.addDoubleClickHandler(new DoubleClickHandler() {
			public void onDoubleClick(DoubleClickEvent event) {
				// Use last used magic attack, no windows/views
				// Use controller to retrieve and use last used magic
			}
		});

		btnMagica.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// Open selection of available magic, current view
				// Magic has very small chance of MISSING the target, for now...
			}
		});

		layoutPanel.add(btnMagica);
		layoutPanel.setWidgetLeftRight(btnMagica, 299.0, Unit.PX, 680.0, Unit.PX);
		layoutPanel.setWidgetTopBottom(btnMagica, 473.0, Unit.PX, 299.0, Unit.PX);

		Image image = new Image("assets/enemy_x.png");
		layoutPanel.add(image);
		layoutPanel.setWidgetLeftRight(image, 197.0, Unit.PX, 463.0, Unit.PX);
		layoutPanel.setWidgetTopBottom(image, 241.0, Unit.PX, 438.0, Unit.PX);
	}

	private String gethealthElementId() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getInnerBackgroundElementId() {
		// TODO Auto-generated method stub
		return null;
	}

	private void enemyFullHealth() {
		Element innerBackgroundElt = DOM.getElementById(getInnerBackgroundElementId());
		innerBackgroundElt.addClassName("healt-bar-full-bg");
	}

	private void enemyDepletedHealth(final double health_update) {
		Element innerBackgroundElt = DOM.getElementById(getInnerBackgroundElementId());
		innerBackgroundElt.removeClassName("health-bar-empty-bg");
		innerBackgroundElt.addClassName("health-bar-depleted-bg");
	}

	private void enemyNoHealth(final double health_update) {
		Element innerBackgroundElt = DOM.getElementById(getInnerBackgroundElementId());
		innerBackgroundElt.removeClassName("health-bar-depleted-bg");
		innerBackgroundElt.addClassName("health-bar-empty-bg");
	}
}
