package supermarket;

public abstract class Command {

	private String title;
	
	protected Ticket ticket;
	
	protected Command(String title) {
		this.title = title;
	}
	
	public void set(Ticket ticket) {
		this.ticket = ticket;
	}

	public abstract void execute();

	public String getTitle() {
		return title;
	}

}
