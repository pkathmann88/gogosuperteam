package de.gogosuperteam.src;

import java.util.HashMap;

public class DBmanager {
	
	static HashMap getAllForums(){
	
		HashMap<Integer, ForumDAO> forumList = new HashMap<Integer, ForumDAO>();
		//to add: Datenbankabfrage
		return forumList;
	}
	
	static HashMap getAllThreadsForForumId (){
		
		HashMap<Integer, ThreadDAO> threadList = new HashMap<Integer, ThreadDAO>();
		//to add: Datenbankabfrage
		return threadList;
		
	}
	
	static HashMap getAllUser (){
		HashMap<Integer, UserDAO> userList = new HashMap<Integer, UserDAO>();
		//to add: Datenbankabfrage
		return userList;
	}
	
	
	
	static HashMap getAllThreads (){
		HashMap<Integer, ThreadDAO> threadList = new HashMap<Integer, ThreadDAO>();
		//to add: Datenbankabfrage
		return threadList;
	}
	
	static HashMap getAllPosts (){
		HashMap<Integer, PostDAO> postList = new HashMap<Integer, PostDAO>();
		//to add: Datenbankabfrage
		return postList;
	}
	
	static HashMap getPostsOfUserId (){
		HashMap<Integer, PostDAO> postList = new HashMap<Integer, PostDAO>();
		//to add: Datenbankabfrage
		return postList;
	}
	
	static HashMap getPostsOfThreadId (){
		HashMap<Integer, PostDAO> postList = new HashMap<Integer, PostDAO>();
		//to add: Datenbankabfrage
		return postList;
	}
	
	
	
	
	

}
