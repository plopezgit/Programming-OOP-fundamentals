import java.util.Scanner;

public class M71Exe6TablaMultiplicar {

	public static void main(String[] args) {
		/* El usuario/a introducirá un número (del 1 al 10) por pantalla, 
		 * y utilizando un bucle, el programa le mostrará la tabla de multiplicar de ese número.
		 */

		System.out.println(getTableMult
								(inputDatos
										("Dime un numero")));
	}

	
	public static String getTableMult (int num) {
		String tablaMult = "";
		for (int i=0; i!=11; i++) {
				tablaMult += num + " x " + i + " = " + (i*num) + "\n";
			}
		return tablaMult;
	}
	
	public static Integer inputDatos (String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta);
		return input.nextInt();	
	}
	
}
