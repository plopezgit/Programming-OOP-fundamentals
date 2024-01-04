import java.util.Scanner;

public class M71Exe3ParesImpares {

	public static void main(String[] args) {
		// El usuario/a debe introducir un número y el programa 
		//debe mostrar por pantalla si el número es par o impar.

		
		System.out.println(evaluadorNumero
					(inputDatos("Dime un numero"), "Es par", "Es impar"));	
		
	} //Fin del metodo main
	
	
	public static String evaluadorNumero (int n1, String s1, String s2) {
		int n2 = 2;
		String result;
		if (n1 % n2 == 0) {
			result = s1;
		} else {
			result=s2;
		}
		return result;
	}
	
	public static Integer inputDatos(String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta); 
		return input.nextInt();	
	}

	
}
