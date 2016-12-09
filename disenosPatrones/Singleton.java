package disenosPatrones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class Singleton {
	
	private static Singleton singleton;
	
	public static Singleton instance() {
		if(singleton==null) {
			String line = Singleton.getSingletonConfigure();
			try {
				singleton = (Singleton) (Class.forName("disenosPatrones."+line).newInstance());
			} catch(ClassNotFoundException e) {
				assert false;
			} catch(InstantiationException e) {
				assert false;
			} catch (IllegalAccessException e) {
				assert false;
			}
		}
		return singleton;
	}
	
	private static String getSingletonConfigure() {
		BufferedReader in = null;
		String line = "";
		try {
			in = new BufferedReader(new FileReader("/home/centa/workspace/disenosPatrones/src/disenosPatrones/singletonConfigure"));
			line = in.readLine().substring(12);
		} catch(IOException ex) {
			System.out.println("IOException al leer: "+ex.getMessage());
		} finally {
			if (in != null) {
				try{
					in.close();
				} catch(IOException ex) {
					System.out.println("IOException al cerrar: "+ex.getMessage());
				}
			}
		}
		return line;
	}
	protected Singleton() {
		
	}
	
	public void m() {
		System.out.println("Ejecución de m de Singleton");
	}
}
