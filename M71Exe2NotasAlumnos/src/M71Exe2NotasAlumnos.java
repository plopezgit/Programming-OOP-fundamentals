import java.util.ArrayList;
import java.util.Scanner;

public class M71Exe2NotasAlumnos {

	public static void main(String[] args) {
		/* Un/a profesor/a quiere calcular las medias de las notas de toda la clase. 
		 * Crea una aplicación donde el usuario introducirá un número por pantalla 
		 * (el número corresponde al número de notas que desea introducir) y el programa 
		 * le pedirá que introduzca las notas de todos los alumnos/as.
		 * 
		 * Una vez que las notas 
		 * han sido introducidas, el programa devuelve lo siguiente:Si la nota media es menor 
		 * que 5: "La nota media de la clase está suspendida. Los alumnos/as deberían preguntar 
		 * sus dudas y trabajar más".Si la nota es inferior a 7: "La nota media de la clase 
		 * es buena, pero los alumnos/as deberían mejorar el trabajo personal".Para el resto 
		 * de casos, el mensaje debe ser: "¡Enhorabuena! La nota media de la clase se corresponde
		 * con el esfuerzo realizado".
		 */
	
		String intro = "Indicar la cantidad de notas que requiere evaluar:";
		
		String obtenerNota ="Ingresa nota #";
		
		String suspendido = "La nota media de la clase está suspendida. Los alumnos/as deberían preguntar"
				+ "sus dudas y trabajar más.";
		
		String bueno = "La nota media de la clasees buena, pero los alumnos/as deberían "
				+ "mejorar el trabajo personal.";
		
		String sobresaliente = "¡Enhorabuena! La nota media de la clase se corresponde con el "
				+ "esfuerzo realizado.";
		
		
		int promedioNotas = obtenerPromedioDeListaNotas
				(crearListaNotas
						(obtenerInt(intro), obtenerNota));
		
		System.out.println(evaluadorNumero (promedioNotas, 7, 5, suspendido, bueno, sobresaliente));
	
		
	} // Fin del metodo main
	

	//Mis metodos utiles
	
	
	public static ArrayList<Integer> crearListaNotas (int size, String pregunta) { // Metodo crear la Lista de notas
		ArrayList<Integer> listaDeNotas = new ArrayList<Integer>();
		for (int i=1; i<=size; i++){
			listaDeNotas.add(obtenerInt(pregunta +i));	
		}
		return listaDeNotas;
	}	
	
	public static Integer obtenerPromedioDeListaNotas (ArrayList<Integer> listaDeNotas) { //Metodo para recorrer lista de Notas y calcular promedio
		int sumaDeNotas = 0;
		int promedioDeNotas= 0;
		for (int i=0; i<listaDeNotas.size(); i++) {
				sumaDeNotas += (int)listaDeNotas.get(i);
		}
		promedioDeNotas = sumaDeNotas / listaDeNotas.size();
		return promedioDeNotas; 
	}

	public static String evaluadorNumero (int n1, int n2, int n3, String s1, String s2, String s3) { //Metodo para evaluar promedio segun reglas
		String result;
		if (n1 < n2) {
			result = s1;
		}
		else if (n1 < n3) {
			result = s2;
		} else {
			result = s3;
		}
		return result; 
	}

	public static int obtenerInt (String pregunta) { // Metodo para obtener Size 
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta); 
		return input.nextInt();
	}

	
}
