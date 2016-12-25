package poo.menu;

public class Principal {
	
	private Menu menu;
	
	public Principal() {
		menu = new Menu();
		menu.añadir(new OpcionMenu1("Opción 1"));
		menu.añadir(new OpcionMenu2("Opción 2"));
		menu.cerrar();
	}
	
	public void ejecutar() {
		do {
		menu.mostrar();
		menu.getOpcion().ejecutar();
		} while(!menu.terminado());
				
	}
	
	public static void main(String[] args) {
		new Principal().ejecutar();
	}

}
