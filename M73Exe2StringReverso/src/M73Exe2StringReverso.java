import java.util.Scanner;

public class M73Exe2StringReverso {

	public static void main(String[] args) {
		/*En este programa el usuario debe introducir un string 
		 * y el programa debe mostrar el string al revés.
		 */
	
		stringInReverse(
				inputString("Dime una palabra o frase"));
	}
	
	public static void stringInReverse (String frase) {
		for (int i=frase.length()-1; i!=-1; i--) {
			System.out.print(frase.charAt(i));
		} 
	}
	
	public static String inputString (String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta);
		return input.nextLine();	
	}
	
}
