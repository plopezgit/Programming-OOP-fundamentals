import java.util.*;

public class M73Exe4CheckDNI {

	public static void main(String[] args) {
		/*
		   El usuario/a debe introducir un DNI y el programa debe 
		   decir si la letra es correcta o no con el número de 
		   DNI. Si la letra no es correcta, debe decir qué letra 
		   es la correcta.
		   Para calcular la letra DNI debes tomar el número de DNI 
		   a verificar y dividirlo entre 23. El residuo se reemplaza 
		   por una letra que ya está asignada a ese número mediante 
		   la tabla adjunta:
		 */
        
		/*ArrayList <String> dniTablaDeValidacion = new ArrayList ();
		String dniLetras = "TRWAGMYFPDXBNJZSQVHLCKE";

		for	(int i=0; i<23; i++) {
			dniTablaDeValidacion.add(dniLetras.charAt(i));
		}*/
		
		int dnin = inputInt("DNI (solo num)");
		char dni = inputChar("Letra del DNI");
		
		System.out.println(correctorDni
								(evaluadorDni(dnin, dni, 
										setResto(dnin)), dnin, dni, "Es valido", "Es invalido"));
		
		
	} //Fin del metodo main
	
	
	public static int setResto (int dnin) {
		int resto = dnin % 23;
			return resto;
	}
	
	public static boolean evaluadorDni (int dnin, char dni, int resto) {
		boolean isValid = false;
		String dniLetras = "TRWAGMYFPDXBNJZSQVHLCKE";
		if (dni == dniLetras.charAt(resto)) {
			isValid = true;
		}	
		return isValid;
	}
	
	public static String correctorDni (boolean isValid, int dnin, char dni, String s1, String s2) {
		String dniLetras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int resto = dnin % 23;
		String result;
		if (evaluadorDni(dnin, dni, resto)) {	
			result = s1;
		} else {
		result = s2 + " la letra correcta es: " + dniLetras.charAt(resto);
		}
		return result;
	}
	
	public static int inputInt (String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta);
		return input.nextInt();	
	}
		
	public static char inputChar (String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta);
		return input.nextLine().charAt(0);	
	}

}