package pruebaVehiculo;

public class Main {
	public static void main(String[] args) {

		//Vehiculo vehiculo1 = new Vehiculo("Citroen", "c4");

		//vehiculo1.MostrarDetalles();
		//Coche vehiculo2 = new Coche("volkvagen", "golf", 3);
		//vehiculo2.MostrarDetalles();
		
		Vehiculo [] vehiculos = new Vehiculo[5];
		
		vehiculos[0]=new Coche ("fiat", "500",4);
		vehiculos[1]=new Coche ("hiunadi", "i20",4);
		vehiculos[2]=new Coche ("Volski", "passsat",3);
		vehiculos[3]=new Coche ("dodge", "ram",6);
		vehiculos[4]=new Coche ("lambo", "Aventador",2);

		for (int i=0; i<vehiculos.length;i++) {
			
			vehiculos[i].MostrarDetalles();
			
		}
		
		

	}

}
