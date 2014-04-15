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
import com.google.gwt.user.client.ui.PasswordTextBox;

public class LoginView extends Composite {
	private TextBox txtbxUsername;
	private TextBox response;
	private PasswordTextBox txtbxPassword;
	//private LoginController controller;

	public LoginView() {

		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);

		txtbxUsername = new TextBox();
		txtbxUsername.setText("Username");
		layoutPanel.add(txtbxUsername);
		layoutPanel.setWidgetLeftWidth(txtbxUsername, 116.0, Unit.PX, 184.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(txtbxUsername, 75.0, Unit.PX, 34.0, Unit.PX);
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

		response = new TextBox();
		response.setVisible(false);
		response.setReadOnly(true);
		layoutPanel.add(response);
		layoutPanel.setWidgetLeftWidth(response, 116.0, Unit.PX, 184.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(response, 234.0, Unit.PX, 50.0, Unit.PX);
		
		txtbxPassword = new PasswordTextBox();
		txtbxPassword.setStyleName("gwt-PasswordBox");
		txtbxPassword.setName("txtbxPassword");
		layoutPanel.add(txtbxPassword);
		layoutPanel.setWidgetLeftWidth(txtbxPassword, 116.0, Unit.PX, 183.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(txtbxPassword, 130.0, Unit.PX, 32.0, Unit.PX);
	}

	//HANDLERS
	protected void handleLogin(){
		String username= txtbxUsername.getText();
		String password= txtbxPassword.getText();
		System.out.println(username+" "+password);
		//controller.logIn(username, password);
		RPC.loginService.login(username, password, new AsyncCallback<User>() {

			@Override
			public void onSuccess(User result) {
				if (result == null) {
					// no such user
					String text = "No Such User Exists";
					response.setVisible(true);
					response.setText(text);

				} else {
					// login successful
					response.setText("Login Successful!");
				}
			}

			@Override
			public void onFailure(Throwable caught) {
				// Display an error message
				response.setText("The system has encountered an error. If it continues please contact Help");
				response.setVisible(true);
			}
		});
	}

	protected void handleNewUser(){

	}
}
