package com.jreale4.RPG.server.model.persist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.jreale4.RPG.shared.Attack;
import com.jreale4.RPG.shared.Equipment;
import com.jreale4.RPG.shared.Hero;
import com.jreale4.RPG.shared.Item;
import com.jreale4.RPG.shared.User;

public class DerbyDatabase implements IDatabase {

	@Override
	public User logIn(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item[] getItemsForHero(Hero h) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Equipment[] getEquipForHero(Hero h) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Attack[] getAttacksForHero(User u) {
		// TODO Auto-generated method stub
		return null;
	}
}
