package de.gogosuperteam.src;

import java.util.ArrayList;

public class Forum {

	private int id;
	private String name;
	private ArrayList<Thread> threadList;

	public Forum(String name, ArrayList<Thread> tl) {
		this.name = name;
		this.threadList = tl;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void addThread(Thread t) {
		threadList.add(t);

	}

	public String getName() {
		return name;
	}

	public ArrayList<Thread> getThreadList() {
		return threadList;
	}

}
