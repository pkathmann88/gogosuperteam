package de.gogosuperteam.src;

import java.util.HashMap;

public class ThreadMapper {

	public static ThreadDAO convert(Thread thread) {
		return new ThreadDAO(thread.getTitel(), thread.getId(), thread.getDatum());
	}
	
	public static Thread convert(ThreadDAO dao, HashMap<Integer, Post> posts) {
		return new Thread(dao.getDatum(), dao.getTitel(), dao.getId(), posts);
	}
}
