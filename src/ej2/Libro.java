package ej2;

public class Libro extends Publicacion {
	private String autor;

	public Libro(String titulo, int año, String autor) {
		super(titulo, año);
		setAutor(autor);

	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor == null) {
			System.out.println("el nombre del auotr no puede estar vacio");
		}
		this.autor = autor;
	}

	public void Calculo() {

		int tiempo = 2025 - getAño();

		System.out.println("el tiempo que ha pasado desde su publicacion es de : "+tiempo+"");
	}

}
