package pruebaPersona;

public class Persona {

	String nombre ;
	int edad;
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public void presentarse() {
		
		
		System.out.println("hola soy: "+ nombre+ " y tengo: "+edad+" años");
	}
	
	
	
	
}
