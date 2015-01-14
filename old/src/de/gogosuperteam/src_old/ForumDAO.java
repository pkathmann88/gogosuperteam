package de.gogosuperteam.src;

public class ForumDAO {
	
	private int id;
	private String name;
	
	public ForumDAO(String name) {
		this.name = name;		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
}
