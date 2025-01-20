package pruebaProtected;

public class Empleado {

	protected int salario;

	public Empleado(int salario) {
		this.salario = salario;
	}

	public void calculo() {

		System.out.println("salario es: " + salario);

	}

}
