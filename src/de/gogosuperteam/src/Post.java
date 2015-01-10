package de.gogosuperteam.src;

import java.util.Date;

public class Post {
	private int id;
	private String thema;
	private String ersteller;
	private String text;
	private Date erstelldatum;
	
	public Post(int id, String thema, String ersteller, String text, Date erstelldatum) {
		this.id = id;
		this.thema = thema;
		this.ersteller = ersteller;
		this.text = text;
		this.erstelldatum = erstelldatum;
	}

	public String getErsteller() {
		return ersteller;
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
