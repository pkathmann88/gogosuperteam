package de.gogosuperteam.src;

import java.util.Date;

public class Post {
	private int id;
	private String thema;
	private int erstellerId;
	private String text;
	private Date erstelldatum;
	
	public Post() {
		
	}
	
	public Post(int id, String thema, int erstellerId, String text, Date erstelldatum) {
		this.id = id;
		this.thema = thema;
		this.erstellerId = erstellerId;
		this.text = text;
		this.erstelldatum = erstelldatum;
	}

	public int getErstellerId() {
		return erstellerId;
	}

	public String getText() {
		return text;
	}

	public Date getErstelldatum() {
		return erstelldatum;
	}

	public int getId() {
		return id;
	}

	public String getThema() {
		return thema;
	}
	

}
