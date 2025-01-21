package ej3;

public class Coche extends Vehiculo {

	
	
	
	private int capacidad ;
	public Coche(int velocidadMaxima, String modelo,int capacidad) {
		super(velocidadMaxima, modelo);
		
setCapacidad(capacidad);
	
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		
		if (capacidad<0) {
			System.out.println("la capacidad ha de ser mayor a 0 ");
		}
		this.capacidad = capacidad;
	}
	
	
	
	public void describir() {
		
		
		System.out.println("el modelo es "+modelo);
		System.out.println("la velocidad maxima es "+velocidadMaxima);
		System.out.println("la capacidad maxima es "+capacidad);

		
	}
	
	
	
	
	


}
