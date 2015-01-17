package de.gogosuperteam.src;

import java.util.Date;

public class ThreadDAO {

	private Date datum;
	private String titel;
	private int id;
	
	public ThreadDAO() {
		
	}
	
	public ThreadDAO(String titel , int id, Date datum) {
		this.titel = titel;
		this.datum = datum;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getId() {
		return id;
	}
}