package ej1;

public class EmpleadoComision extends EmpleadoBase {

	private double porcentaje;
	private double ventas;

	public EmpleadoComision(String nombre, int salario, double porcentaje) {
		super(nombre, salario);
		setPorcentaje(porcentaje);
		setVentas(ventas);

	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {

		if (porcentaje < 0) {
			System.out.println("no puede ser menor que 0");
		}
		this.porcentaje = porcentaje;
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {

		if (ventas < 0) {
			System.out.println("no puede ser menor que 0");
		}
		this.ventas = ventas;
	}

	public double calcularSalario() {
		return super.calcularSalario() + (ventas * (porcentaje / 100));

	}

	@Override
	public String toString() {
		return super.toString() + "EmpleadoComision [porcentaje=" + porcentaje + ", ventas=" + ventas + "]";
	}

}
