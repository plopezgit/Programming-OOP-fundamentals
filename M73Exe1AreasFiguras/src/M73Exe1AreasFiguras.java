import java.util.Scanner;

public class M73Exe1AreasFiguras {

	public static void main(String[] args) {
		/*
		 * Realitzar un programa que tingui un menú on se li mostraran 
		 * 4 opcions a l’usuari/ària per pantalla:
			1.- Quadrat
			2.- Triangle
			3.- Rectangle
			4.- Cercle
			0.- Sortir del programa
			Segons l’opció escollida haurà d’introduir unes dades o altres 
			perquè el programa mostri per pantalla l’àrea (el valor) del polígon
			 escollit.
		 */
		
		String menuOpciones = "Que necesitas convertir\n"
								+ "(1)Cuadrado.\n"
								+ "(2)Triangulo.\n"
								+ "(3)Circulo.\n"
								+ "(4)Salir del programa.";
		
		menuCalculadorAreas
					(inputDatos(menuOpciones));
	
	}
	
	public static void menuCalculadorAreas (int opcion) {		
		switch (opcion) {
		case 1:
			System.out.println(calcularAreaCuadrado(inputDouble("Indicame el lado"), 0));
			break;
		case 2:
			System.out.println(calcularAreaTriangulo(inputDouble("Indicame la base"), inputDouble("Indicame la altura"), 0));
			break;
		case 3:
			System.out.println(calcularAreaCirculo(inputDouble("Indicame el radio"), 0));
			break;
		case 4:
			System.out.println("Adios, vuelve pronto");
			break;
		}
	}
	
	public static double calcularAreaCuadrado (double lado, double resultado) {
		resultado = lado * lado;
		return resultado;
		
	}
	
	public static double calcularAreaTriangulo (double lado, double altura, double resultado) {
		resultado = lado * altura / 2;
		return resultado;
		
	}
	
	public static double calcularAreaCirculo (double radio, double resultado) {
		resultado = (3.1416 * radio) *radio;
		return resultado;
		
	}
	
	public static Integer inputDatos (String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta);
		return input.nextInt();	
	}

	public static Double inputDouble (String pregunta) {
		Scanner input = new Scanner(System.in);
		System.out.println(pregunta);
		return input.nextDouble();	
	}
	
}
