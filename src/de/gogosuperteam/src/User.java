package de.gogosuperteam.src;

import java.util.ArrayList;
import java.util.Date;


public class User {
	
	
	private String name;
	private String password;
	private int id;
	private Date anmeldeDatum;

	private ArrayList<Post> postlist;
	
	public User(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAnmeldeDatum() {
		return anmeldeDatum;
	}

	public void setAnmeldeDatum(Date anmeldeDatum) {
		this.anmeldeDatum = anmeldeDatum;
	}
	
	
	
	

}
