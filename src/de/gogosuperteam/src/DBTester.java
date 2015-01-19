package de.gogosuperteam.src;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DBTester {
		

	
	public static void main(String[] args) throws Exception {
		Commander comm = new Commander();
		
//		HashMap<Integer, Forum> map = comm.getForums();
//		
//		
//		System.out.println(map.get(18).getThreadList().get(23).getPosts().get(403).getText());
//		for (Map.Entry<Integer, Forum> bla : map.entrySet()) {
//			System.out.println(bla.getValue().getName());
//		}
//		
//		
//		
//		HashMap<Integer, Thread> map2 = comm.getThreads(18);
//		
//		for (Map.Entry<Integer, Thread> bla : map2.entrySet()) {
//			System.out.println(bla.getValue().getDatum());
//		}
//		
		testAdd(comm);
		
	}
	
	private static void testAdd(Commander c) throws Exception {
		
		Forum f = new Forum("TestForumPlsIgnore");
		Thread t;// = new Thread("TestThreadPlsIgnore");
		Post p; // = new Post("TestPostPlsIgnore", 1337, "LaremIpsumBlaBla");
		User u;

		f = c.addForum(f);
		u = c.addUser("Boss", "swordfish", false);
		for (int i = 0; i < 5; i++) {
			t = c.addThread(new Thread("TestThreadPlsIgnore"), f.getId());
			for (int j = 0; j < 20; j++) {
				p = c.addPost(new Post("TestPostPlsIgnore", u.getId(),
						"LaremIpsumBlaBla"), t.getId());
			}
		}
	}
}
