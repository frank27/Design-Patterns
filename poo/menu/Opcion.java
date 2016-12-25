package poo.menu;

public abstract class Opcion {
	
	private String titulo;
	
	public Opcion(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public abstract void ejecutar();

	public void mostrar(int i) {
		System.out.println(i+") "+titulo);
		
	}
}
