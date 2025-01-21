package ej2;

public class Diario extends Libro {

	private String tema;

	public Diario(String titulo, int año, String tema) {
		super(titulo, año, tema);
		setTema(tema);
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {

		if (tema == null) {
			System.out.println("el tema no puede eatr vacio");
		}
		this.tema = tema;
	}

	public void mostrar() {

		System.out.println("el titulo es: " + titulo);
		System.out.println("el año de publicacion es: " + año);
		System.out.println("el tema es: " + tema);

	}
}
