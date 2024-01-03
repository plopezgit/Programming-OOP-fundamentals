import java.util.Scanner;

public class M3Exe3ScannerNotas {

	public static void main(String[] args) {
		/* TODO Descripción
			El programa pide al usuario que introduzca 3 notas y 
			el programa muestra la media de las 3 notas por pantalla.
				Nota:
					Las notas que introduce el usuario son números enteros, 
					pero la media puede tener decimales.
		 			*/

		//Variables
		Scanner input = new Scanner(System.in);
		String request1 = "Calculemos la media de tus notas en Lit., Mat. y Dep. Escribe tu nota en Literatura:";
		String request2 = "Bien. Ahora escribe tu nota en Matematicas:";
		String request3 = "Finalmente, escribe tu nota en Deportes";
		byte notaLit, notaMath, notaDeport;
		double promedioNotas = 0.0;
		String output = "Tu promedio de notas es ";
		
		//Scanner e inicializacion notas
		
		System.out.println(request1);
		notaLit = input.nextByte();
		System.out.println(request2);
		notaMath = input.nextByte();
		System.out.println(request3);
		notaDeport = input.nextByte();
		
		//Operacion y Output
		
		promedioNotas = (notaLit + notaMath + notaDeport) / (double)3;
		System.out.println(output + promedioNotas);
		
		input.close();
	}
}
