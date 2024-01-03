import java.util.Scanner;

public class M3ExeExtraTriple {

	public static void main(String[] args) {
		/* Escribe un programa Java que lee un número entero por teclado 
		 * y obtiene y muestra por pantalla el doble y el triple de ese número.
		 */
		
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("Ingresa un numero");
		num = input.nextInt();
		
		System.out.println("*2 = " + num * 2 + "\n*3 = " + num * 3);	
	}
}
