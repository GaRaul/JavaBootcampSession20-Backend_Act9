package logica;

import java.util.Random;

public class Logica {
	
	//Obtenemos un array aleatoria con dos numeros repetidos(los numeros repetidos representaran las dos cartas iguales)
	public int[] obtenerArray() {
		
		int[] arrayNumbers = new int[16];
		int contador = 0;
		
		while(contador < arrayNumbers.length) {
			Random random = new Random();
			int numRandom = random.nextInt(8) + 1; //Generamos un numero aleatoria del 1 -8 ambos inculuidos
			int numRepetido = 0;
			
			for (int i = 0; i < arrayNumbers.length; i++) {
				if(arrayNumbers[i] == numRandom ) {
					numRepetido++;
				}
			}
			if(numRepetido < 2) { //Controlamos los numeros repetidos
				arrayNumbers[contador] = numRandom;
				contador ++;
			}
		}
		return arrayNumbers;		
	}
}
