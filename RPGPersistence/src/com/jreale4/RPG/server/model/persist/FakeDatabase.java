package com.jreale4.RPG.server.model.persist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jreale4.RPG.shared.Attack;
import com.jreale4.RPG.shared.Equipment;
import com.jreale4.RPG.shared.EquipmentType;
import com.jreale4.RPG.shared.Hero;
import com.jreale4.RPG.shared.Item;
import com.jreale4.RPG.shared.ItemType;
import com.jreale4.RPG.shared.Move;
import com.jreale4.RPG.shared.MoveType;
import com.jreale4.RPG.shared.User;


public class FakeDatabase implements IDatabase {
	private int nextUserId = 1;
	private List<User> userList;
	
	private int nextHeroId = 1;
	private List<Hero> heroList;
	
	private int nextItemId = 1;
	private List<Item> itemList;
	
	private int nextAttackId = 1;
	private List<Attack> atkList;
	
	private int nextEquipId = 1;
	private List<Equipment> equipList;
	
	public FakeDatabase() {
		userList = new ArrayList<User>();
		heroList = new ArrayList<Hero>();
		itemList = new ArrayList<Item>();
		atkList = new ArrayList<Attack>();
		equipList = new ArrayList<Equipment>();
		
		readInitialData();
	}

	public void readInitialData(){
		try{
			userList.addAll(InitialData.getUsers());
			heroList.addAll(InitialData.getHero());
//			itemList.addAll(InitialData.getItem());
			atkList.addAll(InitialData.getAttacks());
//			equipList.addAll(InitialData.getEquip());
		}catch (IOException e) {
			throw new IllegalStateException("Couldn't read initial data", e);
		}
	}
	
	@Override
	public User logIn(String userName, String password) {
		for (User user : userList) {
			if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

//	@Override
//	public User newUser(String userName, String password) {
//		// TODO Auto-generated method stub
//		User user = new User();
//		user.setUserName(userName);
//		user.setPassword(password);
//		user.setId(nextUserId++);
//		userList.add(user);
//		return user;
//	}

	@Override
	public Item[] getItemsForHero(Hero h) {
		ArrayList<Item> result = new ArrayList<Item>();
		for (Item item : itemList) {
			if (item.getHeroId() == h.getId()) {
				result.add(item);
			}
		}
		return result.toArray(new Item[result.size()]);
	}

	@Override
	public Attack[] getAttacksForHero(Hero h) {
		ArrayList<Attack> result = new ArrayList<Attack>();
		for(Attack atk : atkList){
			if(atk.getHeroId() == h.getId()){
				result.add(atk);
			}
		}
		return result.toArray(new Attack[result.size()]);
	}

	@Override
	public Equipment[] getEquipForHero(Hero h) {
		ArrayList<Equipment> result = new ArrayList<Equipment>();
		for(Equipment equip : equipList){
			if(equip.getHeroId() == h.getId()){
				result.add(equip);
			}
		}
		return result.toArray(new Equipment[result.size()]);
	}
	
	public Hero getHero(User u){
		Hero result = new Hero();
		for(Hero hero : heroList){
			if(hero.getUserId() == u.getId()){
				result.generateHero(getAttacksForHero(result), null, null);
				return result;
			}
		}
		return null;
	}
}
