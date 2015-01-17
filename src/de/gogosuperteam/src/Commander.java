package de.gogosuperteam.src;

import java.util.LinkedList;
import java.util.List;

public class Commander {

	private DBCommander comm = new DBCommander();

	public static List<Forum> getForums(Forum forum) {

		List<Forum> forums = new LinkedList<Forum>();

//		ArrayList<Integer> keys = new ArrayList(forumDAOs.keySet());
//
//		for (int i = 0; i < keys.size(); i++) {
//			forums.add(ForumMapper.mapToForum(forumDAOs.get(i),
//					new HashMap<Integer, Thread>()));
//		}

		return forums;
	}

	public static List<Thread> getThreads(Forum forum) {

		List<Thread> threads = new LinkedList<Thread>();

//		ArrayList<Integer> keys = new ArrayList(threadDAOs.keySet());
//
//		for (int i = 0; i < keys.size(); i++) {
//			threads.add(ThreadMapper.convert(threadDAOs.get(i),
//					new HashMap<Integer, PostDAO>()));
//		}

		return threads;
	}

	public static List<Post> getPosts(Thread thread) {
		return null;
	}
	
	public static List<Post> searchForum(String suche) {
		return null;
	}

	public static Forum getForum(int id) {
		return null;
	}
	
	public static Post getPost(int id) {
		return null;
	}

	public static Thread getThread(int id) {
		return null;
	}

	public static int getPostCount(Thread tread) {
		return 0;
	}
	
	public static int getThreadCount(Forum forum) {
		return 0;
	}
	
	public static boolean login(String name, String pw) {
		return false;
	}
	
	public static User getUser(String name) {
		return null;
	}
	
	public static Post lastEntry(Forum forum) {
		return null;
	}
	
	public static Post lastEntry(Thread thread) {
		return null;
	}
}
