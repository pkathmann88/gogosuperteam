package de.gogosuperteam.src;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Forum {

	private int id;
	private String name;
	private HashMap<Integer, Thread> threadMap;

	public Forum(String name) {
		this.name = name;
	}
	
	public Forum(int id, String name, HashMap<Integer, Thread> threads) {
		this.id = id;
		this.name = name;
		this.threadMap = threads;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void addThread(Thread t, Integer id) {
		threadMap.put(id, t);
	}

	public String getName() {
		return name;
	}

	public HashMap<Integer, Thread> getThreadMap() {
		return threadMap;
	}
	
	public Collection<Thread> getThreadList() {
		Collection<Thread> threadList = threadMap.values();
		
		return threadList;
	}

}
