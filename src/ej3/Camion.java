package ej3;

public class Camion extends Vehiculo {

	private int capacidadDeCarga;

	public Camion(int velocidadMaxima, String modelo) {
		super(velocidadMaxima, modelo);
	}

	public int getCapacidadDeCarga() {
		return capacidadDeCarga;
	}

	public void setCapacidadDeCarga(int capacidadDeCarga) {

		if (capacidadDeCarga < 0) {
			System.out.println("no puede ser menor a 0 ");
		}

		this.capacidadDeCarga = capacidadDeCarga;
	}

}
