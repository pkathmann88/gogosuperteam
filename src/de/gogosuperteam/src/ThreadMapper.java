package de.gogosuperteam.src;

import java.util.HashMap;

public class ThreadMapper {

	public static ThreadDAO convert(Thread thread) {
		ThreadDAO dao = new ThreadDAO(thread.getTitel(), thread.getId(), thread.getDatum());
		
		return dao;
	}
	
	public static Thread convert(ThreadDAO thread, HashMap<Integer, PostDAO> posts) {
		Thread thed = new Thread(thread.getDatum(), thread.getTitel(), thread.getId());
		
		return thed;
	}
	
}
