package pruebaPersona;

public class Estudiante extends Persona {
	String carrera;

	public Estudiante(String nombre, int edad, String carrera) {
		super(nombre, edad);
		this.carrera = carrera;

	}

	public void presentarse() {

		System.out.println("hola soy: " + nombre + " y tengo: " + edad + " años y estoy estudiando");
	}

	public void estudiar() {

		System.out.println("Estoy estudiando " + carrera);
	}

}
