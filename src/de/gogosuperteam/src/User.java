package de.gogosuperteam.src;

import java.util.Date;
import java.util.HashMap;

public class User {

	private String name;
	private String password;
	private int id;
	private Date anmeldeDatum;
	private boolean admin;

	private HashMap<Integer, Post> postMap;

	public User(String name, String password, boolean admin) {
		this.name = name;
		this.password = password;
		this.admin = admin;
	}

	public User(int id, String name, String password, Date anmeldeDatum,
			boolean admin) {
		this.name = name;
		this.password = password;
		this.id = id;
		this.anmeldeDatum = anmeldeDatum;
		this.admin = admin;
	}

	public boolean compare(String name, String password) {
		if (this.name.equals(name) && this.password.equals(password))
			return true;
		return false;
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

	public HashMap<Integer, Post> getPostMap() {
		return postMap;
	}

	public void setPostMap(HashMap<Integer, Post> postMap) {
		this.postMap = postMap;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
}
