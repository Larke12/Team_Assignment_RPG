package com.jreale4.RPG.server.model.persist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.jreale4.RPG.shared.Attack;
import com.jreale4.RPG.shared.Equipment;
import com.jreale4.RPG.shared.Hero;
import com.jreale4.RPG.shared.Item;
import com.jreale4.RPG.shared.Move;
import com.jreale4.RPG.shared.User;

public class InitialData {
	public static List<User> getUsers() throws IOException {
		List<User> userList = new ArrayList<User>();
		ReadCSV readUsers = new ReadCSV("users.csv");
		try {
			while (true) {
				List<String> tuple = readUsers.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				User user = new User();
				user.setId(Integer.parseInt(i.next()));
				user.setUserName(i.next());
				user.setPassword(i.next());
				userList.add(user);
			}
			return userList;
		} finally {
			readUsers.close();
		}
	}
	
	public static List<Hero> getHero() throws IOException {
		List<Hero> heroList = new ArrayList<Hero>();
		ReadCSV readHero = new ReadCSV("heros.csv");
		try {
			while (true) {
				List<String> tuple = readHero.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				Hero hero = new Hero();
				hero.setId(Integer.parseInt(i.next()));
				hero.setUserId(Integer.parseInt(i.next()));
				heroList.add(hero);
			}
			return heroList;
		} finally {
			readHero.close();
		}
	}
	
	public static List<Attack> getAttacks() throws IOException {
		List<Attack> attackList = new ArrayList<Attack>();
		ReadCSV readAttack = new ReadCSV("attacks.csv");
		try {
			while (true) {
				List<String> tuple = readAttack.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				Attack atk = new Attack(null, null);
				atk.setId(Integer.parseInt(i.next()));
				atk.setHeroId(Integer.parseInt(i.next()));
				atk.setMoveType(Integer.parseInt(i.next()));
				atk.setMove(Integer.parseInt(i.next()));
				attackList.add(atk);
			}
			return attackList;
		} finally {
			readAttack.close();
		}
	}
	
	public static List<Item> getItem() throws IOException {
		List<Item> itemList = new ArrayList<Item>();
		ReadCSV readItem = new ReadCSV("items.csv");
		try {
			while (true) {
				List<String> tuple = readItem.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				if(i!=null){
				Item item = new Item(null);
				item.setId(Integer.parseInt(i.next()));
				item.setHeroId(Integer.parseInt(i.next()));
				item.setItemType(Integer.parseInt(i.next()));
				itemList.add(item);
				}
			}
			return itemList;
		} finally {
			readItem.close();
		}
	}
	
	public static List<Equipment> getEquip() throws IOException {
		List<Equipment> equipList = new ArrayList<Equipment>();
		ReadCSV readEquip = new ReadCSV("equips.csv");
		try {
			while (true) {
				List<String> tuple = readEquip.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				if(i!=null){
				Equipment equip = new Equipment(null, 0);
				equip.setId(Integer.parseInt(i.next()));
				equip.setHeroId(Integer.parseInt(i.next()));
				equip.setEquipLvl(Integer.parseInt(i.next()));
				equip.setEquipType(Integer.parseInt(i.next()));
				equipList.add(equip);
				}
			}
			return equipList;
		} finally {
			readEquip.close();
		}
	}
}
