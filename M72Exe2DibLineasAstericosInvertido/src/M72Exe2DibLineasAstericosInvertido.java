import java.util.Scanner;

public class M72Exe2DibLineasAstericosInvertido {

	public static void main(String[] args) {
		/*
		 	* * * * * * *

			* * * * *
			
			* * * *
			
			* * *
			
			* *
			
			*
		 */

		char pincel= '*';
		dibujoCharDown(
				inputDatos(
						"Dime un numero de lineas"), pincel);
		
	}
	
	
	public static void dibujoCharDown(int lineas, char pincel) {
		for (int i=lineas; i>0 ; i--) {	
			for ( int j=0; j<i ; j++) {	
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
