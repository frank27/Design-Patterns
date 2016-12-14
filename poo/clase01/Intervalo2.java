package poo.clase01;

public class Intervalo {
	
	private double superior;
	
	private double inferior;
	
	public Intervalo(double inferior, double superior) {
		assert inferior<=superior;
		this.superior = superior;
		this.inferior = inferior;
	}
	
	public Intervalo(double superior) {
		this(0, superior);
	}
	
	public Intervalo(Intervalo intervalo){
		this(intervalo.inferior,intervalo.superior);
	}
	
	public Intervalo() {
		this(0,0);
	}
	
	public Intervalo clone() {
		return new Intervalo(this);
	}
	
	public double longitud() {
		return superior-inferior;
	}
	
	public void desplazar(double desplazamiento) {
		superior += desplazamiento;
		inferior += desplazamiento; 
	}
	
	public Intervalo desplazado(double desplazamiento) {
		Intervalo intervalo = this.clone();
		intervalo.desplazar(desplazamiento);
		return intervalo;
	}
	
	public boolean incluye(double valor) {
		return inferior<=valor && valor<=superior;
	}
	
	public boolean incluye(Intervalo intervalo) {
		assert intervalo!=null;
		return this.incluye(intervalo.inferior) && this.incluye(intervalo.superior);
	}
	
	public boolean equals(Intervalo intervalo) {
		return this.inferior == intervalo.inferior && this.superior==intervalo.superior;
	}
	
	public Intervalo interseccion(Intervalo intervalo) {
		assert this.intersecta(intervalo);
		
		if(this.incluye(intervalo)){
			return intervalo.clone();
		} else if(intervalo.incluye(this)) {
			return this.clone();
		} else if(this.incluye(intervalo.inferior)) {
			return new Intervalo(intervalo.inferior,superior);
		} else {
			return new Intervalo(inferior,intervalo.superior);
		}
		
	}
	
	public boolean intersecta(Intervalo intervalo) {
		assert intervalo!=null;
		return this.incluye(intervalo.inferior) || this.incluye(intervalo.superior) || intervalo.incluye(this);
	}
	
	public void oponer() {
		double inferiorInicial = inferior;
		double superiorInicial = superior;
		inferior = -superiorInicial;
		superior = -inferiorInicial;
	}
	
	public void doblar() {
		double longitudInicial=this.longitud();
		inferior-= longitudInicial/2;
		superior+= longitudInicial/2;
	}
	
	public void recoger() {
		GestorIO gestorIO = new GestorIO();
		gestorIO.out("inferior?");
		inferior=gestorIO.inDouble();
		gestorIO.out("Superior?");
		superior=gestorIO.inDouble();
	}
	
	public void mostrar() {
		new GestorIO().out("["+inferior+","+superior+"]");
	}
	
	public Intervalo[] trocear(int trozos) {
		return null;
	}
	
}

class Coordenada {
	public void recoger() {
		
	}
	public void mostrar() {
		
	}
}
