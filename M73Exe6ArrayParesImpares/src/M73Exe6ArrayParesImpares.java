import java.util.*;

public class M73Exe6ArrayParesImpares {

	public static void main(String[] args) {
		/* Dado un array de números, el programa debe mostrar 
		 * la suma de todos los números pares 
		 * y la suma de todos los números impares.
		 */
		
		int cantidad = 5;
		System.out.println("Dame " + cantidad + " numeros");
		SumaNumerosParesImpares (createArrayNumber(cantidad));

	}

	public static int obtenerInt (String pregunta) { 
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta); 
		return input.nextInt();
	}
	
	public static ArrayList<Integer> createArrayNumber(int cantidad) {
	ArrayList <Integer> arrayNumbers = new ArrayList <Integer>();
	int numero;
	for (int i=1; i <=cantidad; i++) {
		numero=obtenerInt("Ingresa numero #"+i);
		arrayNumbers.add(numero);
	}
	return arrayNumbers;
	}
	
	public static void SumaNumerosParesImpares (ArrayList<Integer> arrayNumbers) {
		int number;
		int aux = 2;
		int sumaPares = 0;
		int sumaImpares = 0;
		for (int i=0; i<arrayNumbers.size(); i++ ) {
			
			number = (int) arrayNumbers.get(i);
			
			if (number % aux == 0) {
				sumaPares += number;
			
			}else {
				sumaImpares += number;
			}
		}
		System.out.println("Los pares suman " + sumaPares);
		System.out.println("Los impares suman " + sumaImpares);
	}	
	
}
