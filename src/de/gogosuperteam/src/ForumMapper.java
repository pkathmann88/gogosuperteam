package de.gogosuperteam.src;

import java.util.HashMap;

public class ForumMapper {

	public static Forum convert(ForumDAO forum, HashMap<Integer, Thread> threads) {
		return new Forum(forum.getId(), forum.getName(), threads);
	}
	
	public static ForumDAO convert(Forum forum) {
		return new ForumDAO(forum.getName());
	}
}
