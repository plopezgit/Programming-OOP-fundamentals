import java.util.*;
public class M5Exe2Sumas {

	public static void main(String[] args) {
		/* El programa pide dos números enteros y entonces calcula
		 * la suma de los valores
		 * comprendidos entre los dos números, incluidos.
		 * Ejemplo: 4 y 10 --> resultado = 4 + 5 + 6 + 7 + 8 + 9 + 10 = 49
		 */
		
		//Declaracion
		
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		int nAux;
		//int suma=0;
		//String listaNum = " ";
	
		//Input
		
		System.out.println("Ingresa dos numero");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		//Logica (Esta version no contempla num1==num2)
		
		if (num1>num2) {
			nAux = num1; // Gracias Xavi
			num1 = num2;
			num2 = nAux;	
		}	
		
		System.out.println(sumaListaNum(num1,num2)); // Version usando Metodo
		
		/*for (int i=num1; i<=num2 ; i++) {
			
			suma += i;	//En la primera version me habia complicado guardando en ArrayList
			listaNum += i; //Alimentar un String (Gracias Lex)
		
		}
				
		//Output
		
		System.out.println(listaNum + " = " + suma);*/ 
		
	} //Fin del metodo main
	
	
	
static String sumaListaNum (int num1, int num2) {
	
	int suma=0;
	String listaNum = " ";

	for (int i=num1; i<=num2 ; i++) {
		
		suma += i;	//En la primera version me habia complicado guardando en ArrayList
		listaNum += i; //Alimentar un String (Gracias Lex)
	
	}
	return listaNum + " = " + suma;
		
	} 
}// Fin del metodo sumaListaNum
