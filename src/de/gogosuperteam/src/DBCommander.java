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

	public PostDAO addPost(PostDAO dao) throws SQLException {
		PreparedStatement prep = connect.prepareStatement(
				"insert into post (thema, creator, content) values (?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
		prep.setString(1, dao.getThema());
		prep.setInt(2, dao.getErstellerId());
		prep.setString(3, dao.getText());
		prep.executeUpdate();
		ResultSet set = prep.getGeneratedKeys();
		set.next();
		return new PostDAO(set.getInt(1), dao.getThema(), dao.getErstellerId(),
				dao.getErstelldatum(), dao.getText());
	}

	public PostDAO getPost(int id) throws SQLException {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement
				.executeQuery("select * from post where id=" + id);

		if (resultSet.next()) {
			return new PostDAO(resultSet.getInt("id"),
					resultSet.getString("thema"), resultSet.getInt("creator"),
					resultSet.getDate("creation_date"),
					resultSet.getString("content"));
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
		prep.executeUpdate();
	}

	public ThreadDAO addThread(ThreadDAO dao) throws SQLException {
		PreparedStatement prep = connect.prepareStatement(
				"insert into thread (titel) values (?)",
				Statement.RETURN_GENERATED_KEYS);
		prep.setString(1, dao.getTitel());
		prep.executeUpdate();
		ResultSet set = prep.getGeneratedKeys();
		set.next();
		return new ThreadDAO(dao.getTitel(), set.getInt(1), this.getThread(
				set.getInt(1)).getDatum());
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
		prep.executeUpdate();
	}

	public ResultSet getThreadMap(int ForumId) throws SQLException {
		Statement statement = connect.createStatement();
		return statement
				.executeQuery("select thread_id from forum_to_thread where forum_id="
						+ ForumId);
	}

	public ForumDAO addForum(ForumDAO forum) throws SQLException {
		PreparedStatement prep = connect.prepareStatement(
				"insert into forum (name) values (?)",
				Statement.RETURN_GENERATED_KEYS);
		prep.setString(1, forum.getName());
		prep.executeUpdate();
		ResultSet set = prep.getGeneratedKeys();
		set.next();
		return new ForumDAO(forum.getName(), set.getInt(1));
	}

	public ForumDAO getForum(int id) throws SQLException {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement
				.executeQuery("select * from forum where id=" + id);
		if (resultSet.next()) {
			return new ForumDAO(resultSet.getString("name"),
					resultSet.getInt("id"));
		}
		return null;
	}

	public ResultSet getAllForums() throws SQLException {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from forum");

		return resultSet;
	}

	public UserDAO addUser(UserDAO dao) throws SQLException {
		PreparedStatement prep = connect.prepareStatement(
				"insert into user (name, password, admin) values (?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
		prep.setString(1, dao.getName());
		prep.setString(2, dao.getPassword());
		prep.setBoolean(3, dao.isAdmin());
		prep.executeUpdate();
		ResultSet set = prep.getGeneratedKeys();
		set.next();
		return new UserDAO(dao.getName(), set.getInt(1), dao.getPassword(),
				this.getUser(set.getInt(1)).getAnmeldeDatum(), dao.isAdmin());
	}

	public UserDAO getUser(String name) throws SQLException {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement
				.executeQuery("select * from user where name=" + name);
		if (resultSet.next()) {
			return new UserDAO(resultSet.getString("name"),
					resultSet.getInt("id"), resultSet.getString("password"),
					resultSet.getDate("registration_date"),
					resultSet.getBoolean("admin"));
		}
		return null;
	}

	public UserDAO getUser(int userId) throws SQLException {
		Statement statement = connect.createStatement();
		ResultSet resultSet = statement
				.executeQuery("select * from user where id=" + userId);
		if (resultSet.next()) {
			return new UserDAO(resultSet.getString("name"),
					resultSet.getInt("id"), resultSet.getString("password"),
					resultSet.getDate("registration_date"),
					resultSet.getBoolean("admin"));
		}
		return null;
	}
}
