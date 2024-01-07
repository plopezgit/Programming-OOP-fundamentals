import java.util.Scanner;

public class M72Exe1DibLineasAsteriscos {

	public static void main(String[] args) {
		/* Haz un programa que muestre lo siguiente por pantalla:
			*
			* *
			* * *
			* * * *
			* * * * *
			* * * * * *
			El número de líneas formadas por “*” vendrá dado por un número que el usuario/a 
			introducirá por consola.Condición: En todo el código del programa 
			sólo puede haber un *También, a ser posible, no utilices ningún método 
			como repeat() o substring() de la clase String.*/
		
		char pincel= '*';
		dibujoCharUp(
				inputDatos(
						"Dime un numero de lineas"), pincel);
		
	}
	
	public static void dibujoCharUp (int lineas, char pincel) {
		for (int i=1; i<lineas+1 ; i++) {	
			for ( int j=0; j<i*1 ; j++) {	
				System.out.print(pincel + " ");
			}
			System.out.print("\n\n");	
		}
	}	
	
	public static Integer inputDatos (String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta);
		return input.nextInt();	
	}

}
