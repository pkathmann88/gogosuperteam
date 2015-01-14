package de.gogosuperteam.src;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


public class User {
	
	
	private String name;
	private String password;
	private int id;
	private Date anmeldeDatum;

	private HashMap<Integer, Post> postlist;
	
	public User(){
		
	}
	
	public User (int id, String name, String password, Date anmeldeDatum, HashMap<Integer, Post> postlist){
		this.name = name;
		this.password=password;
		this.id=id;
		this.anmeldeDatum=anmeldeDatum;
		this.postlist = postlist;
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
