package de.gogosuperteam.src;

import java.util.HashMap;

public class ForumMapper {

	public static Forum mapToForum(ForumDAO f, HashMap<Integer, Thread> tl) {

		int idDAO = f.getId();
		String nameDAO = f.getName();

		Forum forum = new Forum(nameDAO, tl);
		forum.setId(idDAO);

		return forum;

	}

}
