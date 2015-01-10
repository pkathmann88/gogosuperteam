package de.gogosuperteam.src;

import java.util.Date;
import java.util.LinkedList;


public class Thread {

	private Date datum;
	private String titel;
	private int id;
	private LinkedList<Post> posts;
	
	public Thread() {
		
	}
	
	public void addPost(Post post) {
		posts.add(post);
	}
	
	public LinkedList<Post> getPosts() {
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
}