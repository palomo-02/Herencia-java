package ej4;

public class Main {

	public static void main(String[] args) {

		Animal[] animales = new Animal[4];

		animales[0] = new Animal("lalo", 4);
		animales[1] = new Perro("firu", 6, "si");
		animales[2] = new Pajaro("cuco", 02, "loro");
		animales[3] = new Animal("eoeoe", 7);

		for (int i = 0; i < animales.length; i++) {

			animales[i].hacerSonido();

			if (animales[i] instanceof Pajaro) {

				((Pajaro) animales[i]).volar();

			}

		}

	}

}
