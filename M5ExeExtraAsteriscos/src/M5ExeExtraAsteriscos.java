import java.util.*;
public class M5ExeExtraAsteriscos {

	public static void main(String[] args) {
		/* Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.
		 * El programa pedirá la altura. El mástil horizontal de la L tendrá una 
		 * longitud de la mitad (división entera entre 2) de la altura más uno. 
		 * (Recordar println y print)
		 */
		
		//Declaracion
		Scanner input = new Scanner(System.in);
		int altura;
		int longitud;
		
		//Input
		System.out.println("Dibujemos una L. Dame altura:");
		altura = input.nextInt();
		
		//Calculo
		longitud = (altura / 2) +1;

		//Output bluce
		for (int i=0; i<altura ; i++) {
			System.out.println("*");
		}
		for (int i=0; i<longitud ; i++) {
			System.out.print("* ");
		}
	}
}
