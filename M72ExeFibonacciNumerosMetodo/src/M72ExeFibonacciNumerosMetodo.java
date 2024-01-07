import java.util.Scanner;

public class M72ExeFibonacciNumerosMetodo {

	public static void main(String[] args) {
		/* El usuario/a introduce un número por teclado y el programa llama a un método que 
		 * debe mostrar la sucesión de Fibonacci
			Ejemplo:
			Si el usuario introduce el 10, el resultado debe ser:
			0,1,1,2,3,5,8,13,21,34
		*/
		
		GetFibonacci(
				inputDatos("Dime un numero"));
		
	}
	
	public static Integer inputDatos (String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta);
		return input.nextInt();	
	}

	public static void GetFibonacci (int limit) { // No logre calcular logica por mi cuenta: https://byspel.com/serie-fibonacci-en-java-explicacion-codigo/
		int f = 0;
		int num1 = 1;
		int num2;
		for (int i=1; i<=limit; i++ ) {
			num2 = f;
			f = num1 + f;
			num1 = num2;
		 System.out.println(num1);
		}
	}
}