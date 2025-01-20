package pruebaElectrodomestico;

public class Televisor extends Electrodomestico {

	int tamañoPantalla;
	
	
	
	
	public Televisor(String marca, int tamañoPantalla) {
		super(marca);
		this.tamañoPantalla=tamañoPantalla;
	}

	 
	
	  public void mostrar() {
	        System.out.println("Marca: " + marca + ", Tamaño de pantalla: " + tamañoPantalla + " pulgadas");
	    }
	}
	
	
	
	
	

