package ej2;

public class Revista extends Publicacion {

	private int numeroEdicion;
	private int MesDePublicacion;

	public Revista(String titulo, int año, int MesDePublicacion, int numeroEdicion) {
		super(titulo, año);

		setNumeroEdicion(numeroEdicion);
		setMesDePublicacion(MesDePublicacion);

	}

	public int getNumeroEdicion() {
		return numeroEdicion;
	}

	public void setNumeroEdicion(int numeroEdicion) {

		if (numeroEdicion < 0) {
			System.out.println("El numero de edicion no puede ser inferior a 0  ");
		}
		this.numeroEdicion = numeroEdicion;
	}

	public int getMesDePublicacion() {
		return MesDePublicacion;
	}

	public void setMesDePublicacion(int mesDePublicacion) {

		if (mesDePublicacion < 0) {
			System.out.println("El mes no puede ser inferior a 0  ");
		}
		MesDePublicacion = mesDePublicacion;
	}

	public void mostrar() {

		System.out.println("el titulo es: " + titulo);
		System.out.println("el año de publicacion es: " + año);
		System.out.println("el mes de publicacion es: " + MesDePublicacion);
		System.out.println("el numero de edicion es: " + numeroEdicion);

	}

}
