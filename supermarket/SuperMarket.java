package supermarket;

public class SuperMarket {
	
	private final static double CLOSING_TIME = 20.0;
	
	private Menu menu;
	
	private SuperMarket() {
		menu = CountryFactory.instance().getMenu();
	}
	
	public void sell() {
		Clock clock = new Clock();
		
		do {
			Ticket ticket = CountryFactory.instance().getTicket();
			
			menu.execute(ticket);
			
			ticket.close();
			
		} while(!clock.isNowOrLater(CLOSING_TIME));
	}
	
	public static void Main(String[] args) {
		new SuperMarket().sell();
	}
}
