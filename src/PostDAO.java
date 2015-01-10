package de.gogosuperteam.src;

import java.util.Date;

public class PostDAO {
	
	private int id ;
	private String ersteller;
	private Date erstelldatum;
	private String text;

	
	
	PostDAO(){
		
	}
	
	
	
	public String getErsteller() {
		return ersteller;
	}



	public void setErsteller(String ersteller) {
		this.ersteller = ersteller;
	}



	public Date getErstelldatum() {
		return erstelldatum;
	}



	public void setErstelldatum(Date erstelldatum) {
		this.erstelldatum = erstelldatum;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public int getId() {
		return id;
	}



	public void setId(int id){
		this.id = id;
	}
	
}
