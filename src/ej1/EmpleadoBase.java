package ej1;

public class EmpleadoBase {

	private String nombre;
	private int salario;

	public EmpleadoBase(String nombre, int salario) {
		this.nombre = nombre;
		setSalario(salario);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {

		if (nombre == null) {
			System.out.println("escriba un nombre");
		}

		this.nombre = nombre;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		if (salario == 0) {
			System.out.println("el salario no puede ser 0 ");
		}
		this.salario = salario;

	}

	public double calcularSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "EmpleadoBase [nombre=" + nombre + ", salario=" + salario + "]";
	}

}
