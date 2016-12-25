package poo.menu;

public class Salir extends Opcion {

	private boolean ejecutado;
	
	public Salir() {
		super("Salir");
		ejecutado = false;
	}

	@Override
	public void ejecutar() {
		ejecutado=true;
	}
	
	public boolean ejecutada() {
		return ejecutado;
	}

}
