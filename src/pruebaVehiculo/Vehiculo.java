package pruebaVehiculo;

public class Vehiculo {

	
	protected String Marca;
	protected String Modelo;
	
	
	public Vehiculo(String marca, String modelo) {
		Marca = marca;
		Modelo = modelo;
	}


	public void MostrarDetalles(){
		System.out.println("marca: "+Marca);
		System.out.println("modelo: "+Modelo);

	}



	
	
	
}
