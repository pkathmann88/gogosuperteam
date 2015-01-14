package de.gogosuperteam.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Commander {
	
	public static List<Forum> GetAllForums() {
HashMap<Integer, ForumDAO> forumDAOs = DBmanager.getAllForums();
		
		List<Forum> forums = new ArrayList<Forum>();
		
		ArrayList<Integer> keys = new ArrayList(forumDAOs.keySet());
		
		for(int i=0; i < keys.size(); i++) {
			forums.add(ForumMapper.mapToForum(forumDAOs.get(i), new HashMap<Integer, Thread>()));
		}
		
		return forums;
	}
	
	public static List<Thread> GetAllThreads(Forum forum) {
		HashMap<Integer, ThreadDAO> threadDAOs = DBmanager.getAllthreads();
		
		List<Thread> threads = new ArrayList<Thread>();
		
		ArrayList<Integer> keys = new ArrayList(threadDAOs.keySet());
		
		for(int i=0; i < keys.size(); i++) {
			threads.add(ThreadMapper.convert(threadDAOs.get(i), new HashMap<Integer, PostDAO>()));
		}
		
		return threads;
	}
	
	public static List<Post> GetAllPosts(Thread thread) {
		return null;
	}
	
	public static List<Post> searchForum(String suche) {
		return null;
	}
	
	public static Post getPost(int id) {
		return null;
	}
	
	public static Thread getThread(int id) {
		return null;
	}
	
	
}
