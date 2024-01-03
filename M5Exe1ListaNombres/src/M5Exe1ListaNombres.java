import java.util.*;

public class M5Exe1ListaNombres {

	public static void main(String[] args) {
		/* Crea un programa que solicite al usuario cuántos nombres 
		 * desea introducir.Una vez tenemos este número, 
		 * pediremos al usuario tantos nombres de persona como ha dicho 
		 * previamente y los almacenaremos en un ArrayList.
		 * Después, mostraremos por pantalla sólo los nombres que comienzan 
		 * por la letra “A”.
		 */

		//Declaracion
		Scanner input = new Scanner(System.in);
		ArrayList<String> ListaDeAlumnos = new ArrayList<String>();
		int sizeDeListaDeAlumnos;
		String nombre;
		char checkA = 'a';
		int i=0;
		
		//Input
		System.out.println("Cuantos personas ingresan"
				+ " y sus nombres?");
			sizeDeListaDeAlumnos = input.nextInt();
		
		for (i=0; i<sizeDeListaDeAlumnos; i++){
			nombre = input.next();
				ListaDeAlumnos.add(nombre);
		}
		
		for (i=0; i<ListaDeAlumnos.size(); i++) {
			//if (ListaDeAlumnos.get(i).contains("A")) {
			if (ListaDeAlumnos.get(i).toLowerCase().charAt(0)==checkA) {
				System.out.println(ListaDeAlumnos.get(i));
			}
		}
	}
}
