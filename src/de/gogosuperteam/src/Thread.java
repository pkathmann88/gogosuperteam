package de.gogosuperteam.src;

import java.util.Date;
import java.util.HashMap;

public class Thread {

	private Date datum;
	private String titel;
	private int id;
	private HashMap<Integer, Post> postMap;

	public Thread(String titel) {
		this.titel = titel;
	}

	public Thread(Date datum, String titel, int id, HashMap<Integer, Post> posts) {
		this.datum = datum;
		this.titel = titel;
		this.id = id;
		this.postMap = posts;
	}

	public void addPost(Post post) {
		postMap.put(post.getId(), post);
	}

	public HashMap<Integer, Post> getPosts() {
		return postMap;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPosts(HashMap<Integer, Post> posts) {
		this.postMap = posts;
	}
}