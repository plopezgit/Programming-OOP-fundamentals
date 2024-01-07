import java.util.*;

public class M71Exe8Conversor {

	public static void main(String[] args) {
		/* Crea un menú que permita cambiar de unidades:
		Pasar de metros a pies.
		De pies a metros.
		De metros a yardas.
		De yardas a metros*/
		
		String pregunta = "Que necesitas convertir\n"
		+ "(1)Pies a Metros.\n"
		+ "(2)Metros a Yardas.\n"
		+ "(3)Yardas a Metros.";
		
		menuConversion(
			inputDatos(pregunta));
	
	}
	
	public static void menuConversion (int opcion) {	
		switch (opcion) {
			case 1:
				System.out.printf("%.2f", conversorPiesMetros(inputDouble("Indicame los pies"), 0));
				break;
			case 2:
				System.out.printf("%.2f", conversorMetrosYardas(inputDouble("Indicame los metros"), 0));
				break;
			case 3:
				System.out.printf("%.2f", conversorYardasMetros(inputDouble("Indicame las yardas"), 0));
				break;
			default:
				System.out.println("Opcion invalida");
		}
	}
	
	public static double conversorPiesMetros (double pies, double resultado) {
		resultado = pies / 3.281;
		return resultado;
	}
	
	public static double conversorMetrosYardas (double metros, double resultado) {
		resultado = metros * 1.094;
		return resultado;	
	}
	
	public static double conversorYardasMetros ( double yardas, double resultado) {
		resultado = yardas / 1.094;
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
