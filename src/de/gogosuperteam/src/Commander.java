package de.gogosuperteam.src;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class Commander {

	private DBCommander comm = new DBCommander();

	public Commander() throws Exception {
		comm.init();
	}

	public List<Forum> getForums() throws SQLException {

		List<Forum> forums = new LinkedList<Forum>();
		ResultSet set = comm.getAllForums();
		
		while(set.next()) {
			// stuff missing till forum & forummapper redo
		}
		
		return forums;
	}
	
	public void addThread(Thread thread, int forumId) throws SQLException {
		comm.addThread(ThreadMapper.convert(thread));
		comm.addThreadMap(forumId, thread.getId());
	}

	public List<Thread> getThreads(Forum forum) throws SQLException {

		List<Thread> threads = new LinkedList<Thread>();
		ResultSet map = comm.getThreadMap(forum.getId());

		while (map.next()) {
			threads.add(ThreadMapper.convert(comm.getThread(map
					.getInt("thread_id"))));
		}

		return threads;
	}
	
	public void addPost(Post post, int threadId) {
		//benötigt post to postDAO convert im Mapper
	}

	public List<Post> getPosts(Thread thread) throws SQLException {
		List<Post> posts = new LinkedList<Post>();
		ResultSet map = comm.getPostMap(thread.getId());

		while (map.next()) {
			posts.add(PostMapper.mapToPost(comm.getPost(map.getInt("post_id"))));
		}

		return posts;
	}

	public List<Post> searchForum(String suche) {
		//optional
		return null;
	}

	public Forum getForum(int id) {
		//needs forum redo
		return null;
	}

	public Post getPost(int id) throws SQLException {
		return PostMapper.mapToPost(comm.getPost(id));
	}

	public Thread getThread(int id) throws SQLException {
		return ThreadMapper.convert(comm.getThread(id));
	}

	public int getPostCount(Thread thread) {
		return thread.getPosts().size();
	}

	public int getThreadCount(Forum forum) {
		//needs forum redo
		return 0;
	}

	public boolean login(String name, String pw) {
		//user schon implementiert?
		return false;
	}

	public User getUser(String name) {
		//needs user imp.
		return null;
	}

	public Post lastEntry(Forum forum) {
		//iwo order by implementieren im DCCommander?
		return null;
	}

	public Post lastEntry(Thread thread) {
		//order by?
		return null;
	}
}
