import java.util.*;

public class M5Exe5PalabrasBonitas {

	public static void main(String[] args) {
		/* Los estudios lingüísticos modernos dicen que las palabras más bonitas 
		 * de diccionario son aquellas que contienen 9 letras y comienzan 
		 * por la letra 'H', o bien, contienen 5 letras y comienzan por la letra 'P'.
		 * Haz un programa que solicite una palabra y determine 
		 * si es hermosa o no (según el patrón explicado previamente).
		 * El método charAt() seguro que puede ayudarte en este ejercicio.
		 * Modifcacion: Tienes que pedir palabras hasta que tengas tres bonitas.
		 * Tienes que ir guardando las palabras bonitas en un array y cuando tengas
		 * las tres, imprimirlas.
		 */
		
		//Declaracion;
		Scanner input = new Scanner(System.in);
		String palabra;
		ArrayList<String> listaDePalabrasBonitas = new ArrayList <String>();
		
		//Bucle de Input y analisis
		while (listaDePalabrasBonitas.size() != 3) {
			System.out.println("Dime palabras bonitas");
			palabra = input.nextLine(); 
			
			if (palabra.length() == 9 && palabra.charAt(0) == 'H' || 
					palabra.length() == 5 && palabra.charAt(0) == 'P' ) {
				
				listaDePalabrasBonitas.add(palabra);
			} else {
			System.out.println("Los linguistan tienen sus reglas, esa no es bonita!");}
		} 
		
		//Output
		
		System.out.println(listaDePalabrasBonitas);
	}
}
