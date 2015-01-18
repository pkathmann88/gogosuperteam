package de.gogosuperteam.src;

import java.util.LinkedList;
import java.util.List;

public class Commander {

	private DBCommander comm = new DBCommander();

	public Commander() throws Exception {
		comm.init();
	}
	
	public List<Forum> getForums(Forum forum) {

		List<Forum> forums = new LinkedList<Forum>();

//		ArrayList<Integer> keys = new ArrayList(forumDAOs.keySet());
//
//		for (int i = 0; i < keys.size(); i++) {
//			forums.add(ForumMapper.mapToForum(forumDAOs.get(i),
//					new HashMap<Integer, Thread>()));
//		}

		return forums;
	}

	public List<Thread> getThreads(Forum forum) {

		List<Thread> threads = new LinkedList<Thread>();

		
//		ArrayList<Integer> keys = new ArrayList(threadDAOs.keySet());
//
//		for (int i = 0; i < keys.size(); i++) {
//			threads.add(ThreadMapper.convert(threadDAOs.get(i),
//					new HashMap<Integer, PostDAO>()));
//		}

		return threads;
	}

	public List<Post> getPosts(Thread thread) {
		return null;
	}
	
	public List<Post> searchForum(String suche) {
		return null;
	}

	public Forum getForum(int id) {
		return null;
	}
	
	public Post getPost(int id) {
		return null;
	}

	public Thread getThread(int id) {
		return null;
	}

	public int getPostCount(Thread tread) {
		return 0;
	}
	
	public int getThreadCount(Forum forum) {
		return 0;
	}
	
	public boolean login(String name, String pw) {
		return false;
	}
	
	public User getUser(String name) {
		return null;
	}
	
	public Post lastEntry(Forum forum) {
		return null;
	}
	
	public Post lastEntry(Thread thread) {
		return null;
	}
}
