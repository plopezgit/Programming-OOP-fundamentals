import java.util.*;

public class M73Exe5ArrayPalabras {

	public static void main(String[] args) {
		/*Dado un arraylist de palabras introducidas por el usuario/a. 
		 * Di el número de palabras que contienen la letra 'a' 
		 * y muéstralas por pantalla.
		 */
		
		int cantidad= 5;
		System.out.println("Dime " + cantidad + " palabras");
		
		System.out.println(obtenerValoresEspecificos
									(listaPalabras (cantidad), 'a'));
		
	}
	
	public static String inputString (String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta); 
		return input.nextLine();	
	}
	
	public static ArrayList<String> listaPalabras(int cantidad) {
		ArrayList <String> listaPalabras = new ArrayList <String> ();
		for (int i=1; i<=cantidad; i++) {
			listaPalabras.add(inputString("Ingresa palabra #"+i));
			}
		return listaPalabras;
	}
	
	public static String obtenerValoresEspecificos (ArrayList<String> listaPalabras, char check ) { 
		String palabrasCheckResult = "";		
		for (int i=0; i<listaPalabras.size(); i++) {
			if (listaPalabras.get(i).toLowerCase().charAt(0)==check) {
				palabrasCheckResult += listaPalabras.get(i) + " ";
			}
		}
		return palabrasCheckResult; 
	}
	
}
