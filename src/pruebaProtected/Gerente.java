package pruebaProtected;

public class Gerente extends Empleado {

	protected int bonus;

	public Gerente(int salario, int bonus) {
		super(salario);
		this.bonus = bonus;
	}

	public void calculo() {

		System.out.println("salario es: " + salario + "y el bonus" + bonus);

		System.out.println("la suma total es: " + (salario + bonus));

	}

}
