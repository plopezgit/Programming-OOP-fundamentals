import java.util.*;

public class M5Exe3RandomWhile {

	public static void main(String[] args) {
		/* Math.ceil((Math.random() * 10));Devuelve un número 
		entre el 1 y el 10 de forma aleatoria.
		El ejercicio consiste en que el usuario/a debe adivinar 
		el número escogido aleatoriamente por el programa.
		El programa, pide números al usuario/a hasta que éste 
		acierte el número aleatorio generado por el programa.
		Una vez el usuario/a ha adivinado el número, se mostrará por 
		pantalla el siguiente mensaje: “Enhorabuena, el número era X”
		 */
		
		//Declaracion:
		Scanner input = new Scanner(System.in);
		int num;
		int ruleta = (int)Math.ceil((Math.random() * 10));
		
		//Input
		System.out.println("Adivina adivinador, dime numeros entre el 1 y el 10:");
		
		//Logica
		do {
			num = input.nextInt();
		} while (ruleta != num);
		
		//Output
		System.out.println("Enhorabuena, el número era " + ruleta);
	}

}
