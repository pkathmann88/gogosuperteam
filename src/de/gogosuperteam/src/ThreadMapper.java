package de.gogosuperteam.src;

public class ThreadMapper {

	public static ThreadDAO convert(Thread thread) {
		ThreadDAO dao = new ThreadDAO(thread.getTitel(), thread.getId(), thread.getDatum());
		
		return dao;
	}
	
	public static Thread convert(ThreadDAO thread) {
		Thread thed = new Thread(thread.getDatum(), thread.getTitel(), thread.getId());
		
		return thed;
	}
	
}
