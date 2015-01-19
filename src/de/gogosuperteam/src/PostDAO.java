package de.gogosuperteam.src;

import java.util.Date;

public class PostDAO {

	private int id;
	private String thema;
	private int erstellerId;
	private Date erstelldatum;
	private String text;

	public PostDAO(String thema, int erstellerId, String text) {
		this.thema = thema;
		this.erstellerId = erstellerId;
		this.text = text;
	}
	
	public PostDAO(int id, String thema, int erstellerId, Date erstelldatum, String text) {
		this.id = id;
		this.thema = thema;
		this.erstellerId = erstellerId;
		this.erstelldatum = erstelldatum;
		this.text = text;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getThema() {
		return thema;
	}

	public int getErstellerId() {
		return erstellerId;
	}

	public Date getErstelldatum() {
		return erstelldatum;
	}

	public String getText() {
		return text;
	}

	public void setThema(String thema) {
		this.thema = thema;
	}

	public void setErstellerId(int erstellerId) {
		this.erstellerId = erstellerId;
	}

	public void setErstelldatum(Date erstelldatum) {
		this.erstelldatum = erstelldatum;
	}

	public void setText(String text) {
		this.text = text;
	}

}
