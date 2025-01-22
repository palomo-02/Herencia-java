package ej4;

public class Pajaro extends Animal {

	private String raza;
	
	
	
	public Pajaro(String nombre, int peso, String raza) {
		super(nombre, peso);
		getRaza();
	}



	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
	}

	
	
	public void hacerSonido() {
		System.out.println("pio pio");
		
		
		
	}
	

	public void volar() {
		System.out.println("el Bicho vuela");
		
		
		
	}
	
	
	
}
