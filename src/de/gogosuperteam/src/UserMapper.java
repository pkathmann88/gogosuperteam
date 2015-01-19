package de.gogosuperteam.src;


public class UserMapper {

	public static User convert(UserDAO user) {
		return new User(user.getId(), user.getName(), user.getPassword(),
				user.getAnmeldeDatum());
	}

	public static UserDAO convert(User user) {
		return new UserDAO(user.getName(), user.getPassword());
	}
}
