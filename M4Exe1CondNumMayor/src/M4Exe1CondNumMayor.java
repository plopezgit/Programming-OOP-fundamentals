import java.util.Scanner;

public class M4Exe1CondNumMayor {

	public static void main(String[] args) {
		/* TODO Crea un programa que sol·liciti a l'usuari/ària 
		 * que introdueixi dos nombres enters per teclat i mostri per 
		 * pantalla el major dels dos.
		 */
		
		//Variables
		Scanner input;
		int num1;
		int num2;
		
		input = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		num1 = input.nextInt();
		
		System.out.println("Dime otro numero");
		num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println("El numero mayor es " + num1);
			
		} else if (num2 > num1) {
			System.out.println("El numero mayor es " + num2);
		} else {
			System.out.println("Los numeros son iguales ");
		}
		input.close();
	}
}
