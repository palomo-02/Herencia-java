package ej2;

public class Main {

	public static void main(String[] args) {

		Publicacion ejemplar1 = new Publicacion("viento y verdad", 2025);
		ejemplar1.mostrar();
		System.out.println("__________________________________________");

		Libro ejemplar2 = new Libro("red rising", 2011, "pepe kimenez");
		ejemplar2.mostrar();
		ejemplar2.Calculo();
		System.out.println("__________________________________________");

		Revista ejemplar3 = new Revista("estudio en escarlarta", 1876, 3, 7);
		ejemplar3.mostrar();

		System.out.println("__________________________________________");
		Diario ejemplar4 = new Diario("fortadelo  y milemon", 1234,"chistesito");
		ejemplar4.mostrar();
		System.out.println("__________________________________________");

	}

}
