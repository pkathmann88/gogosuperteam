package de.gogosuperteam.src;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public class Commander {

	private DBCommander comm = new DBCommander();

	public Commander() throws Exception {
		comm.init();
	}

	public HashMap<Integer, Forum> getForums() throws SQLException {

		HashMap<Integer, Forum> forumMap = new HashMap<Integer, Forum>();
		ResultSet set = comm.getAllForums();

		while (set.next()) {
			forumMap.put(set.getInt("id"),
					ForumMapper.convert(comm.getForum(set.getInt("id")), null));
		}

		return forumMap;
	}

	public Thread addThread(Thread thread, int forumId) throws SQLException {
		Thread t = ThreadMapper.convert(
				comm.addThread(ThreadMapper.convert(thread)), null);
		comm.addThreadMap(forumId, t.getId());
		return t;
	}

	public HashMap<Integer, Thread> getThreads(int forumId) throws SQLException {
		HashMap<Integer, Thread> threadMap = new HashMap<Integer, Thread>();
		ResultSet map = comm.getThreadMap(forumId);
		Thread workThread;

		while (map.next()) {
			workThread = ThreadMapper.convert(
					comm.getThread(map.getInt("thread_id")),
					this.getPosts(map.getInt("thread_id")));
			threadMap.put(workThread.getId(), workThread);
		}

		return threadMap;
	}

	public Post addPost(Post post, int threadId) throws SQLException {
		Post p = PostMapper.convert(comm.addPost(PostMapper.convert(post)));
		comm.addPostMap(threadId, p.getId());
		return p;
	}

	public HashMap<Integer, Post> getPosts(int threadId) throws SQLException {
		HashMap<Integer, Post> postMap = new HashMap<Integer, Post>();
		ResultSet map = comm.getPostMap(threadId);
		Post workPost;

		while (map.next()) {
			workPost = PostMapper.convert(comm.getPost(map.getInt("post_id")));
			postMap.put(workPost.getId(), workPost);
		}

		return postMap;
	}

	public List<Post> searchForum(String suche) {
		// optional
		return null;
	}

	public Forum addForum(Forum forum) throws SQLException {
		return ForumMapper.convert(comm.addForum(ForumMapper.convert(forum)), null);
	}

	public Forum getForum(int forumId) throws SQLException {
		ResultSet map = comm.getThreadMap(forumId);
		HashMap<Integer, Thread> threadMap = new HashMap<Integer, Thread>();
		Thread workThread;

		while (map.next()) {
			workThread = ThreadMapper.convert(
					comm.getThread(map.getInt("thread_id")),
					this.getPosts(map.getInt("thread_id")));
			threadMap.put(workThread.getId(), workThread);
		}
		return ForumMapper.convert(comm.getForum(forumId), threadMap);
	}

	public Post getPost(int postId) throws SQLException {
		return PostMapper.convert(comm.getPost(postId));
	}

	public Thread getThread(int threadId) throws SQLException {
		HashMap<Integer, Post> postMap = new HashMap<Integer, Post>();
		ResultSet map = comm.getPostMap(threadId);
		Post workPost;

		while (map.next()) {
			workPost = PostMapper.convert(comm.getPost(map.getInt("post_id")));
			postMap.put(workPost.getId(), workPost);
		}
		return ThreadMapper.convert(comm.getThread(threadId), postMap);
	}

	public int getPostCount(Thread thread) {
		return thread.getPosts().size();
	}

	public int getThreadCount(Forum forum) {
		return forum.getThreadList().size();
	}

	public boolean login(String name, String pw) throws SQLException {
		if (UserMapper.convert(comm.getUser(name)).compare(name, pw)) {
			return true;
		}
		return false;
	}

	public User addUser(String name, String password) throws SQLException {
		return UserMapper.convert(comm.addUser(new UserDAO(name, password)));
	}

	public User getUser(String name) throws SQLException {
		return UserMapper.convert(comm.getUser(name));
	}

	public User getUser(int userId) throws SQLException {
		return UserMapper.convert(comm.getUser(userId));
	}
	
	public Post lastEntry(Forum forum) {
		// iwo order by implementieren im DBCommander?
		return null;
	}

	public Post lastEntry(Thread thread) {
		// order by?
		return null;
	}
}
