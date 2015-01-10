import java.util.ArrayList;
public class Forum {

	private int id;
	private String name;
	private ArrayList<Thread> threadsList;

	public Forum(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

}
