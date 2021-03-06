package de.gogosuperteam.src;

import java.util.HashMap;

public class Forum {

	private int id;
	private String name;
	private HashMap<Integer, Thread> threadMap;

	public Forum(String name, HashMap<Integer, Thread> tl) {
		this.name = name;
		this.threadMap = tl;
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

	public HashMap<Integer, Thread> getThreadList() {
		return threadMap;
	}

}
