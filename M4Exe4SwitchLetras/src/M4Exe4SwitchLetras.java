import java.util.Scanner;

public class M4Exe4SwitchLetras {

	public static void main(String[] args) {
		/* TODO Crea un programa que sol·liciti a l'usuari/ària que introdueixi 
		 * un número de l'1 al 10 i mostri per pantalla el seu equivalent en lletres 
		 * (per exemple, 1 es mostraria com "u", 2 com "dos", etc.).
		 */

		//Variables
		
		Scanner input= new Scanner(System.in);
		int numeroParaTraducir;
		
		//Input
		
		//do { //oportunidad para bucle
			System.out.println("Introduce un numero del 1 al 10:");
			numeroParaTraducir = input.nextInt();
			input.close();
			
			//Logica
			switch (numeroParaTraducir){
			
				case 1:
					System.out.println("uno");
					break;
					
				case 2:
					System.out.println("dos");
					break;
					
				case 3:
					System.out.println("tres");
					break;
				
				case 4:
					System.out.println("cuatro");
					break;
					
				case 5:
					System.out.println("cinco");
					break;
					
				case 6:
					System.out.println("seis");
					break;
					
				case 7:
					System.out.println("siete");
					break;
					
				case 8:
					System.out.println("ocho");
					break;
					
				case 9:
					System.out.println("nueve");
					break;
					
				case 10:
					System.out.println("diez");
					break;
					
				default:
					System.out.println("Lo siento, el ejercicio necesita un numero del 1 al 10 \n");
						
			}
		//} while (numeroParaTraducir == 0 || numeroParaTraducir > 10); // cierre del bucle
	}
}
