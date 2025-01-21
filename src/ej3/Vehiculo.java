package ej3;

public class Vehiculo {

	private int velocidadMaxima;
private String modelo;





public Vehiculo(int velocidadMaxima, String modelo) {
	this.velocidadMaxima = velocidadMaxima;
	this.modelo = modelo;
}





public int getVelocidadMaxima() {
	return velocidadMaxima;
}





public void setVelocidadMaxima(int velocidadMaxima) {
	this.velocidadMaxima = velocidadMaxima;
}





public String getModelo() {
	return modelo;
}





public void setModelo(String modelo) {
	this.modelo = modelo;
}




public void describir() {
	
	
	System.out.println("el modelo es "+modelo);
	System.out.println("la velocidad maxima es "+velocidadMaxima);

	
}





}
