import java.util.Scanner;

public class M72Exe7AnioBisiestoMetodoEvaluador {

	public static void main(String[] args) {
			/*El usuario/a introduce un año por teclado
				y el programa llama a un método que indique si el año es bisiesto o no.
			 */
			
		System.out.println(evaluadorNumero
								(inputDatos
										("Dime un año"), "Es bisiesto", "No es bisiesto"));	
		
		} //Fin del metodo main
		
		
	public static String evaluadorNumero (int n1, String s1, String s2) {
		String result;
		if (n1 % 400 == 0 ) {
		    result = s1;
		}
		else if (n1 % 4 == 0 && n1 % 100 !=0) {
			result = s1;
		}else {
			result = s2;
		}
			 
		return result;
	}
	
	public static Integer inputDatos (String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta);
		return input.nextInt();	
		}

}