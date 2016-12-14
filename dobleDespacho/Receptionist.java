package dobleDespacho;

public class Receptionist implements VisitorPerson {

	public void receive(Person person) {
		System.out.println("!!!!!!!!!!!! Soy un recepcionista que se alegra de su visita.");
		person.accept(this);
	}

	public void acknowledge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Woman woman) {
		System.out.println("!!!!!! Soy un recepcionista que se admira de su belleza");
		woman.listenCompliment();
		System.out.println("!!!!!!!!Soy un recepcionista que se admira de su existencia");
		woman.listen();
	}

	@Override
	public void visit(Man man) {
		man.receiveSlap(this);
		
	}
	
	public void receiveTip(int euros) {
		System.out.println("!!!!!!!!!!!! Soy un recepcionista que gané "+euros+" euros");
	}
	
	public void thankVisit() {
		System.out.println("!!!!!!! Soy un recepcionista que agradece la visita");
	}

}
