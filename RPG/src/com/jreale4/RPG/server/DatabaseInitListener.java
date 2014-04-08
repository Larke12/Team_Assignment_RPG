package com.jreale4.RPG.server;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.jreale4.RPG.server.model.persist.DatabaseProvider;
import com.jreale4.RPG.server.model.persist.FakeDatabase;

public class DatabaseInitListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent e) {
		// Webapp is starting
		DatabaseProvider.setInstance(new FakeDatabase()); // TODO: use a real database
		System.out.println("Database initialized!");
	}

	@Override
	public void contextDestroyed(ServletContextEvent e) {
		// Webapp is shutting down

	}

}
