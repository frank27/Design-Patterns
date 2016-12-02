package disenosPatrones;

public class Client {
	
	public static void m(){
		System.out.println("hola");
	}
	private void exec() {
		Singleton.instance().m();
	}
	public static void main(String[] args){
		new Client().exec();
	}
}
