import java.util.*;
public class M71Exe1ProcesandoNumeroConMetodos {

	public static void main(String[] args) {
		/* Crea un programa que solicite al usuario que introduzca tres números enteros 
		 * por teclado y muestre por pantalla el mayor de los tres, el menor de los tres 
		 * o si existen dos números iguales.
		 */
	
	int n1 = inputDatos("Dame primer numero");
	int n2 = inputDatos("Dame segundo numero");
	int n3 = inputDatos("Dame tercer numero");
	
	System.out.println(comparadorMayor(n1, n2, n3));
	System.out.println(comparadorMenor(n1, n2, n3));
	comparadorIgual(n1, n2, n3);

	
	}// Fin del metodo main
	

	// Mis metodos utiles
	
	
	public static String comparadorMayor (int n1, int n2, int n3) {
		String mayor;
		if (n1 > n2 && n1 > n3) {
            if (n1 > n3) {
                mayor = "El mayor es: " + n1;                                             
            } else {
            	mayor = "El mayor es: " + n3;     
            }
        } else if (n2 > n3) {
        	mayor = "El mayor es: " + n2; 
        } else {
        	mayor = "El mayor es: " + n3; 
        }
		
		return mayor;
	}
	
	public static String comparadorMenor (int n1, int n2, int n3) {
		String menor;
		if (n1 < n2) {
            if (n1 < n3) {
            	menor = "El menor es: " + n1;                                            
            } else {
            	menor = "El menor es: " + n3;      
            }
        } else if (n2 < n3) {
        	menor = "El menor es: " + n2;
        } else {
        	menor = "El menor es: " + n3; 
        }
		return menor;
	}
	
	public static void comparadorIgual (int n1, int n2, int n3) {
		if (n1 == n2 && n2 != n3 
				|| n3 == n2 && n3 != n1
					|| n1 == n3 && n1 != n2) {
	        
			System.out.println("Existen dos iguales");
		}
	}
	
	public static Integer inputDatos (String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta);
		return input.nextInt();	
	}

	
}
