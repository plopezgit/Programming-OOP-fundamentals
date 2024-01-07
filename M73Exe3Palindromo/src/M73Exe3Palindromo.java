import java.util.Scanner;

public class M73Exe3Palindromo {

	public static void main(String[] args) {
		/* El usuario/a debe introducir una frase y el programa 
		 * debe decir si la frase es un palíndromo.
		 */

		System.out.println(evaluadorPalindromo(
									inputString(
											"Dime una palabra"), "Es un palíndromo", "No es un palíndromo"));	
		
	} //Fin del metodo main
	
	
	public static String evaluadorPalindromo (String palabra, String s1, String s2) {
		String result;
		if (palabra.charAt(palabra.length()-1) == palabra.charAt(0)) {
		    result = s1;
		} else
			result = s2;
		
		return result;
	}
	
	public static String inputString (String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta);
		return input.nextLine();	
	}
	
}