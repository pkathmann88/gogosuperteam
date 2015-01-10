package de.gogosuperteam.src;
import java.util.Date;


public class UserDAO {
	private String name ;
	private int id;
	private String password;
	private Date anmeldeDatum;
	
	
	UserDAO(){
		
	}
	public void SetId(int id){
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
	
	
	
}
