package de.gogosuperteam.src;

import java.sql.*;

public class DBCommander {

	private Connection connect = null;

	public void init() throws Exception {
		Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(
					"jdbc:mysql://pedorius.de:3306", "superteam", "gogo");
			statement = connect.createStatement();
			statement.execute("use gogosuperteam");
		} catch (Exception e) {
			throw e;
		} 
	}

	public void addPost(PostDAO dao) throws SQLException {
		PreparedStatement prep = connect
				.prepareStatement("insert into post (thema, creator, content) values (?,?,?)");
		prep.setString(1, dao.getThema());
		prep.setInt(2, dao.getErstellerId());
		prep.setString(3, dao.getText());
		prep.execute();
	}

	public PostDAO getPost(int id) throws SQLException {
		Statement statement = connect.createStatement();
		PostDAO dao = new PostDAO();
		
		ResultSet resultSet = statement.executeQuery("select * from post where id=" + id);
		
		if(resultSet.next()) {
			dao.setId(resultSet.getInt("id"));
			dao.setErstellerId(resultSet.getInt("creator"));
			dao.setThema(resultSet.getString("thema"));
			dao.setText(resultSet.getString("content"));
			dao.setErstelldatum(resultSet.getDate("creation_date"));
			return dao;
		}

		return null;
	}
	
	public ResultSet getAllPosts() throws SQLException {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from post");
	
		return resultSet;
	}
	
	public void addThread(ThreadDAO dao) throws SQLException {
		PreparedStatement prep = connect.prepareStatement("insert into thread (titel) values (?)");
		prep.setString(1, dao.getTitel());
		prep.execute();
	}

	public ThreadDAO getThread(int id) throws SQLException {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from thread where id=" + id);
	
		ThreadDAO dao;
		if(resultSet.next()) {
			dao = new ThreadDAO(resultSet.getString("titel"), resultSet.getInt("id"), resultSet.getDate("date"));
			return dao;
		}
		return null;
	}
	
	public ResultSet getAllThreads(int ForumId) throws SQLException {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from forum_to_thread");
		
		while(resultSet.next()) {
			//CONTINUE HERE
		}
	
		return resultSet;
	}
	
	public void addForum(ForumDAO forum) throws SQLException {
		PreparedStatement prep = connect.prepareStatement("insert into forum (name) values (?)");
		prep.setString(1, forum.getName());
		prep.execute();
	}
	
	public ForumDAO getForum(int id) throws SQLException {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from forum where id=" + id);
	
		ForumDAO dao;
		if(resultSet.next()) {
			dao = new ForumDAO(resultSet.getString("name"));
			dao.setId(resultSet.getInt("id"));
			return dao;
		}
		return null;
	}
	
	public void addUser(UserDAO dao) {
		
	}
	
	public UserDAO getUser(String name) throws SQLException {
		UserDAO dao = new UserDAO();
		ResultSet resultSet;
		
//		if(resultSet.next()) {
//			return dao;
//		}
		
		return null;
	}
}
