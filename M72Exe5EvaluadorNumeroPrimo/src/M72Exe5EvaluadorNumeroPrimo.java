import java.util.Scanner;

public class M72Exe5EvaluadorNumeroPrimo {

	public static void main(String[] args) {
		/*El usuario introduce un número por teclado y el programa 
		 * llama a un método que indique si el número es primero o no.
		 */
		
		System.out.println(evaluadorNumeroPrimo
								(inputDatos
										("Dime un numero"), "Es primo", "No es primo"));	
		
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
