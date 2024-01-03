import java.util.Scanner;

public class M3Exe2ScannerCalcula {

	public static void main(String[] args) {
		/* Descripción
		Hacer un programa que le pida dos números enteros al usuario/a. 
		Al final, el programa imprime por pantalla el siguiente mensaje:
			El resultado de la suma es: "valor"
			El resultado del resto es: "valor"
			El resultado de la multiplicación es: "valor"
			El resultado de la división es: "valor".
		 */

		// Variables
		
		Scanner input = new Scanner(System.in);
		String instruccion1 = "Vamos a calcular! Dame un numero:";
		String instruccion2 = "Dame otro numero:";
		long num1;
		long num2;
		
		// Scanner de numeros
		
		System.out.println(instruccion1);
		num1 = input.nextLong();
		System.out.println(instruccion2);
		num2 = input.nextLong();
		
		//Operaciones
		
		long resultSuma = num1 + num2;
		long resultResta = num1 - num2;
		long resultMulti = num1 * num2;
		long resultDiv = num1 / num2;
		
		// Output resultados de calculos
		
		System.out.println("El resultado de la suma es: " + resultSuma);
		System.out.println("El resultado de la resta es: " + resultResta);
		System.out.println("El resultado de la multiplicación es: " + resultMulti);
		System.out.println("El resultado de la división es: " + resultDiv);
		
		input.close();
	}
}
