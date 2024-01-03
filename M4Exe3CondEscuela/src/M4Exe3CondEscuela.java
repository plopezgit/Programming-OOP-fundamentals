import java.util.Scanner;

public class M4Exe3CondEscuela {

	public static void main(String[] args) {
		/* TODO Una escuela de idiomas (concede becas) a futuros estudiantes si
		 * cumplen una serie de (requisitos).
		 * Al alumno/a se le asigna una beca si es mayor de edad (y) título universitario. 
		 * O también se le asigna una beca si el alumno/a está en paro.
		 * El programa pide los tres datos por pantalla y en
		 * finalizar muestra si el alumno/a tiene la beca o no.
		 
		
		//Declaracion e inicializacion
		
		Scanner input = new Scanner(System.in);
		char esMayor;
		char tieneTitulo;
		char estaParo;
		final String RESP_POSITIVA = "Si puedes aplicar a una beca";
		final String RESP_NEGATIVA = "No puedes aplicar a una beca";
		
		//Inputs
		
		System.out.println("Hola, evaluacion para Becas...");
		System.out.println("Eres mayor de Edad? Responde con la tecla: s/n");
		esMayor = input.nextLine().charAt(0);
		System.out.println("Tienes titulos universitario? Responde con la tecla: s/n");
		tieneTitulo = input.nextLine().charAt(0);
		System.out.println("Estas en paro? Responde con la tecla: s/n");
		estaParo = input.nextLine().charAt(0);
		input.close();

		//Analisis de condiciones
		
		if (esMayor == 's' && tieneTitulo == 's' || estaParo == 's') {
			System.out.println(RESP_POSITIVA);	
		} else {
			System.out.println(RESP_NEGATIVA);
		}
		
		/*Alternativa corta ternari (https://www.w3schools.com/java/java_conditions_shorthand.asp):
	
			String result = (esMayor == 's' && tieneTitulo == 's' || estaParo == 's') ? "Si puedes aplicar a una beca" : "No puedes aplicar a una beca";
			System.out.println(result); 
		*/ 	 
		
		//Alternativa usando variable String para almacentar input de usuario
		
		Scanner input = new Scanner(System.in);
		String esMayor = " ";
		String tieneTitulo = " ";
		String estaEnParo = " ";
		final String RESP_POSITIVA = "Si puedes aplicar a una beca";
		final String RESP_NEGATIVA = "No puedes aplicar a una beca";
		
		System.out.println("Hola, evaluacion para Becas...\n Eres mayor de Edad? Responde si o no");
		esMayor = input.nextLine();
		System.out.println("Tienes titulo universitario? Responde si o no");
		tieneTitulo = input.nextLine();
		System.out.println("Estas en paro? Responde si o no");
		
		if (esMayor.equalsIgnoreCase("si") && tieneTitulo.equalsIgnoreCase("si")
				|| estaEnParo.equalsIgnoreCase("si")) {
			System.out.println(RESP_POSITIVA);
		} else {
			System.out.println(RESP_NEGATIVA);
		}
		
		
	}
}
