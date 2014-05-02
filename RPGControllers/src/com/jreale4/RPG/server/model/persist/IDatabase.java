package com.jreale4.RPG.server.model.persist;

import com.jreale4.RPG.shared.Attack;
import com.jreale4.RPG.shared.Equipment;
import com.jreale4.RPG.shared.Hero;
import com.jreale4.RPG.shared.Item;
import com.jreale4.RPG.shared.User;

public interface IDatabase {
	public User logIn(String userName, String password);
	public User newUser(String userName, String password);
	public Item[] getItemsForHero(Hero h);
	public Attack[] getAttacksForHero(Hero h);
	public Equipment[] getEquipForHero(Hero h);
}
