package de.gogosuperteam.src;

import java.util.ArrayList;
import java.util.HashMap;

public class UserMapper {

	static User MapToUser (UserDAO user, HashMap<Integer, Post> postlist){
		
		
		
		User newUser = new User (user.getId(), user.getName(), user.getPassword(), user.getAnmeldeDatum(), postlist);
		
		return newUser;
	}
	
}
