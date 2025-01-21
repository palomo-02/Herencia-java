package ej1;

public class Gerente extends EmpleadoComision {

	private int bono;

	public Gerente(String nombre, int salario, double porcentaje, int bono) {
		super(nombre, salario, porcentaje);

		setBono(bono);

	}

	public int getBono() {
		return bono;
	}

	public void setBono(int bono) {
		if (bono == 0) {
			System.out.println("el bono no puede ser 0 ");
		}
		this.bono = bono;
	}

	public double calcularSalario() {
		return super.calcularSalario() + (bono);

	}

	@Override
	public String toString() {
		return super.toString() + "Gerente [bono=" + bono + "]";
	}

}
