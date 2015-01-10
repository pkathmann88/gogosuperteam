package src;

import java.util.Date;

public class Post {
	private String erstellen;
	private String text;
	private Date erstelldatum;
	
	public Post(){
		
	}

	public String getErstellen() {
		return erstellen;
	}

	public void setErstellen(String erstellen) {
		this.erstellen = erstellen;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getErstelldatum() {
		return erstelldatum;
	}

	public void setErstelldatum(Date erstelldatum) {
		this.erstelldatum = erstelldatum;
	}

}
