import java.util.Scanner;

public class M3Exe1Scanner {

	public static void main(String[] args) {
		/* TODO Descripcion:
		Fer un programa que li DEMANDI a l’usuari/ària: El NOM, el COGNOM i l’EDAT.
		Un cop l’usuari/ària hagi acabat d’introduir les dades, aquestes s’han de mostrar per pantalla.*/

		//Declaracion 
		
		Scanner input;
		String nombre;
		String apellido;
		Byte edad;
		
		//Inicializacion
		
		input = new Scanner(System.in);
		
		System.out.println("Hola, vamos a crear tu ID. Escribe por favor tu Nombre:");
		nombre = input.nextLine();
		System.out.println("Gracias " + nombre + ". Ahora escribe tu Apellido:");		
		apellido = input.nextLine();		
		System.out.println("Genial " + nombre + ' ' + apellido + " para finalizar escribe tu Edad:");		
		edad = input.nextByte();
		System.out.println("Listo! Tu ID es: " + nombre + apellido + edad);
		
		input.close();
	}

}
