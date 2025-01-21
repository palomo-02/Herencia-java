package ej1;

public class Main {

	public static void main(String[] args) {

		EmpleadoBase persona1 = new EmpleadoBase("pepe", 15000);
		System.out.println("el sueldo de la persona: " + persona1.getNombre() + " con sueldo: " + persona1.getSalario()
				+ " es: " + persona1.calcularSalario());

		EmpleadoComision persona2 = new EmpleadoComision("luis", 4000, 50,34);
		System.out.println("el sueldo de la persona: " + persona2.getNombre() + " con sueldo: " + persona2.getSalario()
				+ " con porcentaje: " + persona2.getPorcentaje() + "es: " + persona2.calcularSalario());

		Gerente persona3 = new Gerente("lolo", 50000, 80, 4,40);
		System.out.println("el sueldo de la persona: " + persona3.getNombre() + " con sueldo: " + persona3.getSalario()
				+ " con porcentaje: " + persona3.getPorcentaje() + " y con bono: " + persona3.getBono() + " es: "
				+ persona3.calcularSalario());

	}

}
