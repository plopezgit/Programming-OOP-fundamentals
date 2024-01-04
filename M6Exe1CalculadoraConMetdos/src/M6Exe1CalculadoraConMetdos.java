import java.util.Scanner;

public class M6Exe1CalculadoraConMetdos {

	public static void main(String[] args) {
		/* TODO Hacer un programa que solicite dos números y un operador(+,-,*,/).
		 * Al final, el programa debe imprimir por pantalla 
		 * el resultado de realizar la operación que contenga la variable operador.
		 */
		
		//Variables
		Scanner input = new Scanner(System.in);
			int operando1 = 0 , operando2 = 0;
			char operador;
			
		//Input
		//do {
			System.out.println("Soy una calculadora.\nDime un numero:");
			operando1 = input.nextInt();
			System.out.println("Dime otro numero");
			operando2 = input.nextInt();
			System.out.println("Dime un operador: + , - , *, /");
			operador = input.next().charAt(0);
			input.close();
			
			//Logica
				switch (operador) {
					
				case '+':
					System.out.println(sumaNum(operando1, operando2));
					break;
				
				case '-':
					System.out.println(restaNum(operando1, operando2));
					break;
					
				case '*':
					System.out.println(multiNum(operando1, operando2));
					break;
					
				case '/':
					System.out.printf("%.2f" , divNum(operando1, operando2));
					break;
				
				default:
					System.out.println("Ese no es un operador. Teclea uno de estos + , - , * , /");
				}
		//} while (operador != '+' && operador != '-' && operador != '*' && operador != '/');
	}
	
	// Metodos calculador
	
	static Integer sumaNum (int operando1, int operando2) { // Metodo suma
		
		int resultado=0;
		resultado = operando1 + operando2;

		return resultado;
			
	} // Fin del metodo Suma
	
	static Integer restaNum (int operando1, int operando2) { // Metodo resta
		
		int resultado=0;
		resultado = operando1 - operando2;

		return resultado;
			
	} // Fin del metodo Resta
	
	static Integer multiNum (int operando1, int operando2) { // Metodo multiplicacion
		
		int resultado=0;
		resultado = operando1 * operando2;

		return resultado;
			
	} // Fin del metodo Multiplicacion
	
	static Double divNum (int operando1, int operando2) { // Metodo Division
		
		double resultado=0;
		resultado = (double)operando1 / operando2;

		return resultado;
			
	} // Fin del metodo Division

}
