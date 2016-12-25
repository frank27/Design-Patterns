package poo.menu;
import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	private List<Opcion> opciones;
	
	private GestorIO gestorIO;
	
	private Salir salir;
	
	public Menu() {
		gestorIO = new GestorIO();
		opciones = new ArrayList<Opcion>();
		salir = new Salir();
	}

	public void añadir(Opcion opcionMenu1) {
		opciones.add(opcionMenu1);
	}

	public void cerrar() {
		this.añadir(salir);
		
	}

	public void mostrar() {
		for (int i = 0; i < opciones.size(); i++) {
			opciones.get(i).mostrar(i+1);
		}
		
	}

	public Opcion getOpcion() {
		System.out.println("INgrese opción:");
		int opción=gestorIO.inInt();
		return opciones.get(opción-1);
	}

	public boolean terminado() {
		return salir.ejecutada();
	}

}
