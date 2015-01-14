package de.gogosuperteam.src;

import java.util.Date;
import java.util.HashMap;

public class Thread {

	private Date datum;
	private String titel;
	private int id;
	private HashMap<Integer, Post> posts;
	
	public Thread(Date datum, String titel, int id) {
		this.datum = datum;
		this.titel = titel;
		this.id = id;
	}
	
	public void addPost(Post post) {
		posts.put(id, post);
	}
	
	public HashMap<Integer, Post> getPosts() {
		return posts;
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
		this.posts = posts;
	}
}