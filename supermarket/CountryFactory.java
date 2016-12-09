package supermarket;

import supermarket.spanishConfiguration.SpanishFactory;

public abstract class CountryFactory {
	
	private static CountryFactory countryFactory;
	
	public static CountryFactory instance() {
		if(countryFactory == null) {
			countryFactory = new SpanishFactory();
		}
		return countryFactory;
	}
	
	public abstract Menu getMenu();
	
	public abstract Ticket getTicket();
	
	protected CountryFactory(){
		
	}

}
