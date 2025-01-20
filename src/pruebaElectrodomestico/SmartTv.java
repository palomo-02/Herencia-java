package pruebaElectrodomestico;

public class SmartTv extends Televisor {
	boolean conexion;

	public SmartTv(String marca, int tamañoPantalla, boolean conexion) {
		super(marca, tamañoPantalla);
		this.conexion = conexion;
	}

	public void mostrar() {

		System.out.println("Marca: " + marca + ", Tamaño de pantalla: " + tamañoPantalla + " pulgadas"
				+ "¿tiene conexion?" + conexion);

	}

}
