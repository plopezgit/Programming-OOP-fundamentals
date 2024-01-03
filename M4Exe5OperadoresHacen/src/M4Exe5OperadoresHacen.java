import java.util.Scanner;

public class M4Exe5OperadoresHacen {

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
					System.out.println(operando1 + operando2);
					break;
				
				case '-':
					System.out.println(operando1 - operando2);
					break;
					
				case '*':
					System.out.println(operando1 * operando2);
					break;
					
				case '/':
					double resultadoDiv = (double) operando1 / operando2; //Practica de cast
					System.out.printf("%.3f" , resultadoDiv);
					break;
				
				default:
					System.out.println("Ese no es un operador. Teclea uno de estos + , - , * , /");
				}
		//} while (operador != '+' && operador != '-' && operador != '*' && operador != '/');
	}
}
