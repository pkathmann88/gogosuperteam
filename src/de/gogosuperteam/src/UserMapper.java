package de.gogosuperteam.src;

import java.util.ArrayList;

public class UserMapper {

	static User MapToUser (UserDAO user, ArrayList<Post> postlist){
		
		
		
		User newUser = new User (user.getId(), user.getName(), user.getPassword(), user.getAnmeldeDatum(), postlist);
		
		return newUser;
	}
	
}
