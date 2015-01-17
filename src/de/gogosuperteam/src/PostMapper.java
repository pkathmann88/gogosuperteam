package de.gogosuperteam.src;

import java.util.Date;

public class PostMapper {
	
	public static Post mapToPost(PostDAO p){
		
		int idDAO = p.getId();
		String themaDAO = p.getThema();
		int erstellerDAO = p.getErstellerId();
		String textDAO = p.getText();
		Date erstelldatumDAO = p.getErstelldatum();
		
		Post post = new Post(idDAO,themaDAO, erstellerDAO, textDAO, erstelldatumDAO);
		
		return post;
	}

}
