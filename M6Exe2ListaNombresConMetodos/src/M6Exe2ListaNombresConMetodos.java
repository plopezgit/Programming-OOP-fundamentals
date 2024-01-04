import java.util.ArrayList;
import java.util.Scanner;

public class M6Exe2ListaNombresConMetodos {

	public static void main(String[] args) {
		/* Crea un programa que solicite al usuario cuántos nombres 
		 * desea introducir.Una vez tenemos este número, 
		 pediremos al usuario tantos nombres de persona como ha dicho 
		 previamente y los almacenaremos en un ArrayList.
		 Después, mostraremos por pantalla sólo los nombres que comienzan 
		 * por la letra “A”.
		 */
			
		//Logica en metodos (version extrema inutil)
			
		printValores(obtenerValoresEspecificos(crearListaNombres(obtenerInt("Cuanto nombres ingresar en la lista"), ("Nombre del # ")) , 'a' ));
		
		
	} // Fin del metodo main
	
	//Mis metodos
	
	public static int obtenerInt (String pregunta) { // Metodo para obtener Size (que solicite al usuario cuántos nombres desea introducir)
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta); 
		return input.nextInt();
	}

	public static String obtenerString (String pregunta) { // Metodo para obtener nombres por consola
		Scanner input = new Scanner(System.in); 
		System.out.println(pregunta); 
		return input.nextLine();
	}

	public static ArrayList<String> crearListaNombres (int size, String pregunta) { // Metodo crear la Lista de alumnos (pediremos al usuario tantos nombres de persona como ha dicho previamente y los almacenaremos en un ArrayList.)
		ArrayList<String> ListaDeNombres = new ArrayList<String>();
		String nombre;
		for (int i=1; i<=size; i++){
			nombre=obtenerString(pregunta);
			ListaDeNombres.add(nombre);
		}
		return ListaDeNombres;
	}	
	
	public static String obtenerValoresEspecificos (ArrayList<String> ListaDeNombres, char check ) { //Metodo para recorrer lista de Alumnos (por la letra “A”)
		String nombresCheckResult = "";		
		for (int i=0; i<ListaDeNombres.size(); i++) {
			if (ListaDeNombres.get(i).toLowerCase().charAt(0)==check) {
				nombresCheckResult += (String)ListaDeNombres.get(i) + ", ";
			}
		}
		return nombresCheckResult; 
	}
	
	public static void printValores (String valores) { // Metodo para imprimir (Después, mostraremos por pantalla sólo los nombres que comienzan por la letra “A”.)
		System.out.println(valores);
	}
	
} // Fin de la clase
