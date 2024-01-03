import java.util.Scanner;

public class M4Exe2CondBandaSalario {
	
	public static void main(String[] args) {
		/* TODO Crea un programa que solicite al usuario que introduzca el
		 * su nombre y el número de años que lleva trabajando en una empresa para
		 * teclado y muestre por pantalla su nivel salarial,
		 * según la siguiente tabla:

			Menos de 2 años - 25.000 €
			Entre 2 y 4 años 35.000€
			Más de 4 y hasta 7 años 50.000€
			Más de 7 y hasta 10 años 65.000€
			Más de 10 años 80.000€
		 */

		// Declaraciones e inicializacion:
		
		Scanner input = new Scanner(System.in);
		String nombre;
		int aniosTrabajados = 0;
		final int BANDA_SALARIAL_1 = 25000;
		final int BANDA_SALARIAL_2 = 35000;
		final int BANDA_SALARIAL_3 = 50000;
		final int BANDA_SALARIAL_4 = 65000;
		final int BANDA_SALARIAL_5 = 80000;
		
		// Requests
		
		System.out.println("Hola, cual es tu nombre?");
		nombre = input.nextLine();
		System.out.println("Gracias " + nombre + " cuanto años has trabajado?");
		aniosTrabajados = input.nextInt();
		
		//Analisis condicional y output
		
		if (aniosTrabajados < 2) {
			System.out.println("Tu banda salarial es de " + BANDA_SALARIAL_1);
		} else if (aniosTrabajados <4) {
			System.out.println("Tu banda salarial es de " + BANDA_SALARIAL_2);
		} else if (aniosTrabajados <7){
			System.out.println("Tu banda salarial es de " + BANDA_SALARIAL_3);
		} else if (aniosTrabajados <10) {
			System.out.println("Tu banda salarial es de " + BANDA_SALARIAL_4);
		} else if (aniosTrabajados >10) {
			System.out.println("Tu banda salarial es de " + BANDA_SALARIAL_5);
		}
		input.close();
	}
}
