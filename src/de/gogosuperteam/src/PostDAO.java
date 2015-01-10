package de.gogosuperteam.src;

import java.util.Date;

public class PostDAO {

	private int id;
	private String thema;
	private String ersteller;
	private Date erstelldatum;
	private String text;

	PostDAO(String thema, String ersteller, String text, Date erstelldatum) {
		this.thema = thema;
		this.ersteller = ersteller;
		this.text = ersteller;
		this.erstelldatum = erstelldatum;

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

	public String getErsteller() {
		return ersteller;
	}

	public Date getErstelldatum() {
		return erstelldatum;
	}

	public String getText() {
		return text;
	}

}
