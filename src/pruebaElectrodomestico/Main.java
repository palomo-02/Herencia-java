package pruebaElectrodomestico;

public class Main {

	public static void main(String[] args) {

		Electrodomestico aparato1 = new Electrodomestico("samsung");
		aparato1.mostrar();

		Televisor aparato2 = new Televisor("siaomi", 55);
		aparato2.mostrar();

		SmartTv aparato3 = new SmartTv("apple", 20, true);
		aparato3.mostrar();

		SmartTv aparato4 = new SmartTv("marakambo", 44, false);
		aparato4.mostrar();

	}

}
