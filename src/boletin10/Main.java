package boletin10;
public class Main {
    public static void main(String[] args) {
        
        // Crear un array de 5 animales
        Animal[] Animales = new Animal[5];
        
        // Asignar diferentes instancias a cada posición del array
        Animales[0] = new Animal("Pepe", 9);  // Animal básico
        Animales[1] = new Perro("Firulais", 3);  // Instancia de Perro
        Animales[2] = new Perro("Max", 4);  // Instancia de Perro
        Animales[3] = new Gato("Miau", 2);  // Instancia de Gato
        Animales[4] = new Animal("Rex", 5);  // Animal básico

        // Recorrer el array y llamar al método hacerRuido() para cada animal
        for (int i = 0; i < Animales.length; i++) {  // Comienza en 0 para incluir todos los animales
            Animales[i].hacerRuido();  // Llamar al método hacerRuido() de cada animal
        }
    }

		
		
		
	//	Animal Animal1 = new Animal("firulais", 8);

		//Animal1.hacerRuido();
		//Perro Animal2 = new Perro("firulais", 8);

		//Animal2.hacerRuido();
		//Animal2.Morder();

		//Gato Animal3 = new Gato("misifu", 11);

		//Animal3.HacerRuido();
		//Animal3.CazarRatones();
	

}
