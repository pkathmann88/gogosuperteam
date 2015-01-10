import java.util.Date;

public class Thread {

	private Date datum;
	private String titel;
	private int id;

	public Thread(String titel) {
		this.titel = titel;
	}

	public void setId(int id) {
		this.id = id;
	}
}
