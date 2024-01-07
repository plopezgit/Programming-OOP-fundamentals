import java.util.Scanner;

public class M72Exe6UsoEvaluadorPrimo {

	public static void main(String[] args) {
		/*El usuario/a debe introducir números hasta que introduzca un número primero.
		 * En el momento que el usuario introduzca un número primero, 
		 * el programa debe sacar por pantalla el siguiente mensaje: 
		 * "Exacto, ¡el número “x” es primero!
		 */
	
		
		int n1 =inputDatos("Dime un numero"); // creo la variable por que la reuso
		System.out.println(evaluadorNumeroPrimo
							(n1, "Exacto, ¡el numero " + n1 + " es primo!", "¡No es primo!"));

		
	} //Fin del metodo main
	
	public static Integer inputDatos (String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta);
		return input.nextInt();	
	}
	
	public static String evaluadorNumeroPrimo (int n1, String s1, String s2) {
		String result= " ";
			if (n1 == 0 || 
					n1 == 1 || 
						n1 == 4) {
			    result = s2;
			}
			
			for (int i = 0; i <= n1 / 2; i++) {
				if (n1 % 2 == 0) {
			      result = s2;
				} else {
					result =s1;
				}
					
			}
		return result;
	}	
	
}