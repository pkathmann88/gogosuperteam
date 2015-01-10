import java.util.Date;

public class ThreadDAO {

	private Date datum;
	private String titel;
	private int id;

	public ThreadDAO(String titel) {
		this.titel = titel;
	}

	public void setId(int id) {
		this.id = id;
	}
}
