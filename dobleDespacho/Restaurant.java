package dobleDespacho;

import java.util.Random;

public class Restaurant {
	private Receptionist receptionist;
	
	private Waiter waiter;
	
	private Restaurant() {
		receptionist = new Receptionist();
		waiter = new Waiter();
	}
	
	public static void main(String[] args) {
		new Restaurant().simulateScene();
	}
	
	private void simulateScene() {
		Random random = new Random(System.currentTimeMillis());
		
		for(int i=0; i<5; i++) {
			Person person;
			if (random.nextInt(2)==0) {
				person = new Man();
			} else {
				person = new Woman();
			}
			this.simulateScene(person);
		}
		
	}

	private void simulateScene(Person person) {
		person.greet();
		receptionist.receive(person);
		person.ask();
		waiter.serve(person);
		person.part();
		waiter.pickup();
		receptionist.acknowledge();
		System.out.println("...");
		System.out.println("... past the time!");
		System.out.println("...");
	}
}
