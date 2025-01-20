package pruebaVehiculo;

public class Coche extends Vehiculo {
	private int puertas;

	public Coche(String marca, String modelo, int puertas) {
		super(marca, modelo);
		this.puertas = puertas;
		// TODO Auto-generated constructor stub
	}

	public void MostrarDetalles() {
		System.out.println("marca: "+Marca);
		System.out.println("modelo: "+Modelo);
		System.out.println("tiene estas puertas: "+puertas);
System.out.println("__________________");
	}

}
