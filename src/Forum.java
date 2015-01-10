import java.util.ArrayList;
public class Forum {

	private int id;
	private String name;
	private ArrayList<Thread> threadList;

	public Forum(String name) {
		this.name = name;
		this.threadList = new ArrayList<Thread>();
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void addThread(Thread t){
		threadList.add(t);
		
	}
	
	

}
