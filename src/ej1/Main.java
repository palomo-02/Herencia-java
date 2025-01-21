package ej1;

public class Main {

	public static void main(String[] args) {

		EmpleadoBase persona1 = new EmpleadoBase("pepe", 15000);

		persona1.calcularSalario();
		EmpleadoComision persona2 = new EmpleadoComision("luis", 4000, 50);
		persona2.calcularSalario();

		Gerente persona3 = new Gerente("lolo", 50000, 80, 4);
		persona3.calcularSalario();

	}

}
