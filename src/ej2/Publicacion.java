package ej2;

public class Publicacion {


		protected String titulo;
		protected int año;
		
		public Publicacion(String titulo, int año) {
			this.titulo = titulo;
			this.año = año;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			
			if (titulo==null) {
				System.out.println("El titulo no puede estar vacio ");
			}
			this.titulo = titulo;
		}

		public int getAño() {
			return año;
		}

		public void setAño(int año) {
			if (año<0) {
				System.out.println("El año no puede ser inferior a 0  ");
			}
			this.año = año;
		}

		public void mostrar() {
			
			System.out.println("el titulo es: "+titulo);
			System.out.println("el año de publicacion es: "+año);

			
			
		}
		
	

}
