package de.gogosuperteam.src;

import java.util.Date;

public class Post {
	private int id;
	private String thema;
	private int erstellerId;
	private String text;
	private Date erstelldatum;
	
	public Post(String thema, int erstellerId, String text) {
		this.thema = thema;
		this.erstellerId = erstellerId;
		this.text = text;
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
	
	public void setId(int id) {
		this.id = id;
	}

	public void setThema(String thema) {
		this.thema = thema;
	}

	public void setErstellerId(int erstellerId) {
		this.erstellerId = erstellerId;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setErstelldatum(Date erstelldatum) {
		this.erstelldatum = erstelldatum;
	}

}
