package com.radicle;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/UserService")
public class UserService {

	UserDao userDao = new UserDao();
	
	@GET 
	@Path("/users") 
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
	
}
