import java.util.Scanner;

public class M3ExeExtraMultiplica {

	public static void main(String[] args) {
		/* Escribe un programa Java que solicite por pantalla un número entero, 
		 * y si es menor que 10, lo asigne a una variable de tipo int, 
		 * llamada varInt. Si no lo es, entonces le asignará a la variable 
		 * varInt el número 1. 
		 * (¿Utiliza para ello el operador condicional? :)
		 * Luego, imprime la tabla de multiplicar de esta variable.
		 */
		
		Scanner input = new Scanner(System.in);
		int numStep;
		int num;
		
		System.out.println("Dame un numero");
		numStep = input.nextInt();
		
		if (numStep < 10) {
			num = numStep;
		} else {
			num = 1;
		}
		
		System.out.println((num * 1) + " " + (num * 2) + " " + (num * 3) + " " + (num * 4) +
				" " + (num * 5) + " " + (num * 6) + " " + (num * 7) + " " + (num * 8) +
				" " + (num * 9) + " " + (num * 10));
		
		



	}

}
