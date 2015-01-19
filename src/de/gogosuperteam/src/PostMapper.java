package de.gogosuperteam.src;

public class PostMapper {

	public static Post convert(PostDAO dao) {
		return new Post(dao.getId(), dao.getThema(), dao.getErstellerId(),
				dao.getText(), dao.getErstelldatum());
	}

	public static PostDAO convert(Post post) {
		return new PostDAO(post.getThema(), post.getErstellerId(),
				post.getText());
	}

}
