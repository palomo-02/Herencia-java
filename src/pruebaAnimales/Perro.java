package pruebaAnimales;

public class Perro extends Animal {

	public Perro(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
	
	public void hacerRuido(){
		
		System.out.println("guau guau");
	}
	public void Morder() {
		System.out.println("el perro muerde");
	}


}
