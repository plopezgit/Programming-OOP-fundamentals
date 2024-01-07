import java.util.Scanner;

public class M72Exe4FactorialDeNum {

	public static void main(String[] args) {
		/* Realizar un programa en el que el usuario introduce un número 
		 * y el programa llama a un método que devuelve el factorial del número 
		 * introducido.El factorial de un número n (entero, no negativo) es el 
		 * producto de todos los números enteros positivos inferiores o iguales a n.
		 */

		System.out.println(evaluadorNumeroFactorial
							(inputDatos("Dime un numero")));	
		
	} //Fin del metodo main
	
	public static Integer evaluadorNumeroFactorial (int n1) {
		int resultado=1;
		for (int i=2; i<=n1 ; i++) {
			
			resultado *= i;
		}
		return resultado;
	}
	
	public static Integer inputDatos (String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta);
		return input.nextInt();	
	}
		
}
