package ej4;

public class Perro extends Animal {

	
	private String pedigri;
	
	
	
	public Perro(String nombre, int peso,String pedigri) {
		super(nombre, peso);
		getPedigri();
	
	}



	public String getPedigri() {
		
		
		return pedigri;
	}



	public void setPedigri(String pedigri) {
		this.pedigri = pedigri;
	}

	
	public void hacerSonido() {
		System.out.println("El perro hace guau");
		
		
		
	}
	
	
}
