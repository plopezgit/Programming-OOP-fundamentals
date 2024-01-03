import java.util.Scanner;

public class M3ExeExtraPared {

	public static void main(String[] args) {
		/* Escribe un programa Java que calcule los litros de pintura 
		 * necesarios para pintar una pared rectangular.
		Un litro de pintura cubre aproximadamente, 12m² en una sola mano.
		Crea una constante llamada cobertura Litro para guardar el dato de 
		cobertura de la pintura (12m²)
		Tendrás que pedir al usuario:

		- El alto y ancho de la pared (multiplicante sabrás el área de la misma)
		- El número de manos a aplicar.
			Muestra en pantalla los litros de pintura a utilizar.
		*/

		//Declaracion
		
		Scanner input = new Scanner(System.in);
		final int LITRO = 12;
		double altoPared;
		double anchoPared;
		int numManosPintura = 0;
		
		//Input:
		
		System.out.println("Indica el alto de la pared en metros:");
		altoPared = input.nextDouble();
		System.out.println("Indica el ancho de la pared en medtros:");
		anchoPared = input.nextDouble();
		System.out.println("Cuantas manos de pintura?");
		numManosPintura = input.nextInt();
		input.close();
		
		//Calculo e impresion	
		
		double areaPared = altoPared * anchoPared; 
		
		System.out.println("Litros de pintura: " + areaPared / LITRO * numManosPintura);
	}
}
