package ej3;

public class Moto extends Vehiculo {

	
	private int cilindrada;
	public Moto(int velocidadMaxima, String modelo) {
		super(velocidadMaxima, modelo);
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		if (cilindrada<0) {
			System.out.println("no puede ser menor a 0 ");
		}
		this.cilindrada = cilindrada;
	}
	
	
	public void describir() {
		
		
		System.out.println("el modelo es "+modelo);
		System.out.println("la velocidad maxima es "+velocidadMaxima);
		System.out.println("la cilindrada maxima es "+cilindrada);

		
	}
	

}
