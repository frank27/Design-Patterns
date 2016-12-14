package dobleDespacho;

public abstract class Person {

	public void greet() {
		System.out.println("???????? SOy una persona que saluda al entrar");
	}
	
	public abstract void accept(Waiter waiter);
	
	public void ask() {
		System.out.println("???? Soy una persona que pide un menu");
	}

	public void part() {
		System.out.println("???? Soy una persona que se despide al salir");
		
	}

	public void accept(Waiter waiter) {
		// TODO Auto-generated method stub
		
	}

}
