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

	public void addPost(PostDAO dao, int threadId) throws SQLException {
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

		ResultSet resultSet = statement
				.executeQuery("select * from post where id=" + id);

		if (resultSet.next()) {
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

	public ResultSet getPostMap(int threadId) throws SQLException {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement
				.executeQuery("select post_id from thread_to_post where thread_id="
						+ threadId);

		return resultSet;

	}

	public void addPostMap(int threadId, int postId) throws SQLException {
		PreparedStatement prep = connect
				.prepareStatement("insert into thread_to_post (thread_id, post_id) values (?,?)");
		prep.setInt(1, threadId);
		prep.setInt(2, postId);
		prep.execute();
	}

	public void addThread(ThreadDAO dao) throws SQLException {
		PreparedStatement prep = connect
				.prepareStatement("insert into thread (titel) values (?)");
		prep.setString(1, dao.getTitel());
		prep.execute();
	}

	public ThreadDAO getThread(int id) throws SQLException {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement
				.executeQuery("select * from thread where id=" + id);

		ThreadDAO dao;
		if (resultSet.next()) {
			dao = new ThreadDAO(resultSet.getString("titel"),
					resultSet.getInt("id"), resultSet.getDate("date"));
			return dao;
		}
		return null;
	}

	public void addThreadMap(int forumId, int threadId) throws SQLException {
		PreparedStatement prep = connect
				.prepareStatement("insert into forum_to_thread (forum_id, thread_id) values (?,?)");
		prep.setInt(1, forumId);
		prep.setInt(2, threadId);
		prep.execute();
	}

	public ResultSet getThreadMap(int ForumId) throws SQLException {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement
				.executeQuery("select thread_id from forum_to_thread where forum_id="
						+ ForumId);

		return resultSet;
	}

	public void addForum(ForumDAO forum) throws SQLException {
		PreparedStatement prep = connect
				.prepareStatement("insert into forum (name) values (?)");
		prep.setString(1, forum.getName());
		prep.execute();
	}

	public ForumDAO getForum(int id) throws SQLException {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement
				.executeQuery("select * from forum where id=" + id);

		ForumDAO dao;
		if (resultSet.next()) {
			dao = new ForumDAO(resultSet.getString("name"));
			dao.setId(resultSet.getInt("id"));
			return dao;
		}
		return null;
	}

	public ResultSet getAllForums() throws SQLException {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from forum");

		return resultSet;
	}

	public void addUser(UserDAO dao) {
		// pretty importantos
	}

	public UserDAO getUser(String name) throws SQLException {
		UserDAO dao = new UserDAO();
		ResultSet resultSet;

		// if(resultSet.next()) {
		// return dao;
		// }

		return null;
	}
}
