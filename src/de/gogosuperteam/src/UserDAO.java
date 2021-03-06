package de.gogosuperteam.src;

import java.util.Date;

public class UserDAO {
	private String name;
	private int id;
	private String password;
	private Date anmeldeDatum;
	private boolean admin;

	UserDAO(String name, String password, boolean admin) {
		this.name = name;
		this.password = password;
		this.admin = admin;
	}

	UserDAO(String name, int id, String password, Date anmeldeDatum, boolean admin) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.anmeldeDatum = anmeldeDatum;
		this.admin = admin;
	}

	public void SetId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getAnmeldeDatum() {
		return anmeldeDatum;
	}

	public void setAnmeldeDatum(Date anmeldeDatum) {
		this.anmeldeDatum = anmeldeDatum;
	}
	
	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
}
