import java.util.Scanner;
public class M4ExeExtraPapelTijera {

	public static void main(String[] args) {
		/* Esta línea de código:
			int numRandom = (int)(Math.random() * 3) + 1;
			Devuelve un número entre el 1 y el 3 de forma aleatoria.
				Escribe un programa que te permita jugar piedra, papel o tijera con el ordenador.
				Para ello el ordenador deberá generar un número aleatorio entre 1 y 3 que represente piedra, 
				papel o tijera respectivamente, y el usuario deberá responder a su vez con un número entre el 
				1 y el 3 después que mostrar la siguiente pantalla:
				Jugamos a piedra, papel o tijera:
					1. Piedra
					2. Papel
					3. Tijera
					Elección (1-3):	
				Si el usuario indica algún número distinto del solicitado, deberá aparecer el siguiente mensaje:
				«Entiendo que no quieres jugar. Adiós»
				En caso contrario, indicar al ganador/a de la siguiente forma:
				Yo xxx y tú xxx. ¡He ganado!, o ¡Has ganado!
				Según sea el caso.
				Ejemplo:
				«Yo papel y tú tijera. ¡Has ganado!» */
		
		Scanner input = new Scanner(System.in);
		int jugada = 0;
		int numRandom;
		String opciones= "Jugamos a piedra, papel o tijera:\n"
				+ "1. Piedra \n"
				+ "2. Papel\n"
				+ "3. Tijera\n"
				+ "4. Salir\n"
				+ "Eleccion (1-4)";
		final String PAR = " Estamos par";
		final String GANA_RANDOM = " He ganado";		
		final String GANA_USUARIO = " Has ganado";		

	
		do { //Adcional al requerimiento: estructura de loop
			System.out.println(opciones);
			jugada = input.nextInt();
			numRandom = (int)(Math.random() * 3) + 1;
			
			if (jugada == 1 && numRandom == 1) {
				System.out.println("Yo " + numRandom + " Tu " + jugada + PAR);
	
			}else if (jugada == 2 && numRandom == 2) {
				System.out.println("Yo " + numRandom + " Tu " + jugada + PAR);
				
			}else if (jugada == 3 && numRandom == 3) {
				System.out.println("Yo " + numRandom + " Tu " + jugada + PAR);
				
			}else if (jugada == 1 && numRandom == 2) {
				System.out.println("Yo " + numRandom + " Tu " + jugada + GANA_RANDOM);
				
			}else if (jugada == 1 && numRandom == 3) {
				System.out.println("Yo " + numRandom + " Tu " + jugada + GANA_USUARIO);
				
			}else if (jugada == 2 && numRandom == 1) {
				System.out.println("Yo " + numRandom + " Tu " + jugada + GANA_USUARIO);
				
			}else if (jugada == 2 && numRandom == 3) {
				System.out.println("Yo " + numRandom + " Tu " + jugada + GANA_RANDOM);
				
			}else if (jugada == 3 && numRandom == 1) {
				System.out.println("Yo " + numRandom + " Tu " + jugada + GANA_RANDOM);
				
			}else if (jugada == 3 && numRandom == 2) {
				System.out.println("Yo " + numRandom + " Tu " + jugada + GANA_USUARIO);
				
			}else{
				System.out.println("Entiendo que no quieres jugar. Adiós");
				
			}
		} while (jugada !=4);
	}
}
