import java.util.Scanner;

public class M72Exe3DibAsteriscosCurva {

	public static void main(String[] args) {
		/*
		 	*
		 	
			* *
			
			* * *
			
			* * * *
			
			* * * * *
			
			* * * * * *
			
			* * * * *
			
			* * * *
			
			* * *
			
			* *
			
			*
		 */

		char pincel= '&';
		int lineas = inputDatos("Dime un numero de lineas");
		dibujoCharUp(lineas, pincel);	
		dibujoCharDown(lineas-1, pincel);
	}


	
	public static void dibujoCharUp (int lineas, char pincel) {
		for (int i=1; i<lineas+1 ; i++) {	
			for ( int j=0; j<i*1 ; j++) {	
				System.out.print(pincel + " ");
			}
			System.out.print("\n\n");	
		}
	}	
	
	public static void dibujoCharDown (int lineas, char pincel) {
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
