package de.gogosuperteam.src;

import java.util.Date;

public class PostMapper {
	
	public static Post mapToPost(PostDAO p){
		
		int idDAO = p.getId();
		String themaDAO = p.getThema();
		String erstellerDAO = p.getErsteller();
		String textDAO = p.getText();
		Date erstelldatumDAO = p.getErstelldatum();
		
		Post post = new Post(idDAO,themaDAO, erstellerDAO, textDAO, erstelldatumDAO);
		
		return post;
	}

}
