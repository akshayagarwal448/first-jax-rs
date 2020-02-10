package com.radicle;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
	public List<User> userList;
	
	public UserDao(){
		userList = new ArrayList<User>();
		userList.add(new User(1, "A1", "P1"));
		userList.add(new User(2, "A2", "P2"));
		userList.add(new User(3, "A3", "P3"));
		userList.add(new User(4, "A4", "P4"));
		userList.add(new User(5, "A5", "P5"));
		userList.add(new User(6, "A6", "P6"));
		userList.add(new User(7, "A7", "P7"));
		userList.add(new User(8, "A8", "P8"));
	}
	
	public List<User> getAllUsers(){ 
		return userList;
	}
	
}
