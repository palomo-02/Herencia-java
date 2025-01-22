package ej4;

public class Animal {

	protected String nombre;
	protected int peso;

	public Animal(String nombre, int peso) {
		this.nombre = nombre;
		this.peso = peso;
	}

	public void hacerSonido() {
		System.out.println("El animal hace ruidos");

	}

}
