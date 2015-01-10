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

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getId() {
		return id;
	}
}