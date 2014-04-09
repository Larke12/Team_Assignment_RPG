package com.jreale4.RPG.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
//import com.jreale4.RPG.server.controllers.LoginController;
import com.jreale4.RPG.shared.User;

public class LoginView extends Composite {
	private TextBox txtbxUsername;
	private TextBox txtbxPassword;
	//private LoginController controller;
	
	public LoginView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		
		TextBox txtbxUsername = new TextBox();
		txtbxUsername.setText("Username");
		layoutPanel.add(txtbxUsername);
		layoutPanel.setWidgetLeftWidth(txtbxUsername, 116.0, Unit.PX, 184.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(txtbxUsername, 75.0, Unit.PX, 34.0, Unit.PX);
		
		TextBox txtbxPassword = new TextBox();
		txtbxPassword.setText("Password");
		layoutPanel.add(txtbxPassword);
		layoutPanel.setWidgetLeftWidth(txtbxPassword, 116.0, Unit.PX, 184.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(txtbxPassword, 138.0, Unit.PX, 34.0, Unit.PX);
		
		Button btnLogin = new Button("Login");
		btnLogin.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleLogin();
			}
		});
		layoutPanel.add(btnLogin);
		layoutPanel.setWidgetLeftWidth(btnLogin, 116.0, Unit.PX, 81.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnLogin, 198.0, Unit.PX, 30.0, Unit.PX);
		
		Button btnNewAccount = new Button("New Account");
		btnNewAccount.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				handleNewUser();
				
			}
		});
		layoutPanel.add(btnNewAccount);
		layoutPanel.setWidgetLeftWidth(btnNewAccount, 203.0, Unit.PX, 97.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(btnNewAccount, 198.0, Unit.PX, 30.0, Unit.PX);
	}
	
//	public void setConroller(LoginController controller){
//		this.controller= controller;
//	}
	
	//HANDLERS
	protected void handleLogin(){
		String username= String.valueOf(txtbxUsername);
		String password= String.valueOf(txtbxPassword);
		
		//controller.logIn(username, password);
		RPC.loginService.login(username, password, new AsyncCallback<User>() {
			
			@Override
			public void onSuccess(User result) {
				if (result == null) {
					// no such user
				} else {
					// login successful
				}
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// Display an error message
			}
		});
	}
	
	protected void handleNewUser(){
		
	}
}
