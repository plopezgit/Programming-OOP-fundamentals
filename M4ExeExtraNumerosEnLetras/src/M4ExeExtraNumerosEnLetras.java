import java.util.Scanner;
public class M4ExeExtraNumerosEnLetras {

	public static void main(String[] args) {
		/* TODO Pide al usuario un número entre 0 y 99 y muéstralo escrito 
		 * en letras:Ejemplo: 56 (cincuenta y seis) o 56 (cincuenta y seis)
		 */
		
		//Declaracion
		
		Scanner input = new Scanner(System.in);
		int numero;
		
		//Input
		System.out.println("Ingresa un numero:");
		numero = input.nextInt();
		input.close();
		
		//Output
		System.out.println(convertirNumeroATexto(numero));
	
	}
	
	
	/* Logica: Metodo encontrado: 
	 * (https://es.stackoverflow.com/questions/300852/como-pasar-de-n%C3%BAmeros-a-letras)
	 * Entenderlo paso a paso:
	 * 1) creacion del metodo de conversion que espera como unico parametro una variable de tipo numero entero 
	 * y retorna una variable tipo String.
	 * 2) El codigo del metodo incluye:
	 * 		- Tres arreglos tipo String que almacenan variables en orden de menor a mayor con 
	 * 		traducciones de "unidades", "numero especiales" y "decenas".
	 * 		- Estructura condicional if que segun el entero analisa analisa la posicion del arreglo de traduccion
	 * 		que debe retornar y maneja la excepcion para numero superiores a 99.
	 */
    
    
	public static String convertirNumeroATexto(int numero) {
        String unidades[] = new String[]{"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis",
                "siete", "ocho", "nueve"}; 

        String especiales[] = new String[]{"diez","once", "doce", "trece", "catorce", "quince", "dieciseis",
                "diecisiete", "dieciocho", "diecinueve"};

        String decenas[] = new String[]{ "veinte", "treinta", "cuarenta", "cincuenta", "sesenta",
                "setenta", "ochenta", "noventa"}; 

        if (numero < 10) {
            return unidades[numero];
        }
        if (numero < 20) {
            return especiales[numero - 10];
        }
        if (numero < 100 && numero % 10 == 0) {
            int index = (numero / 10) - 2;
            return decenas[index];
        }

        if(numero<100){
            int dIndex = (numero/10)-2;
            int uIndex = (numero%10);
            return decenas[dIndex] + " y " + unidades[uIndex];
        }
        //Se ajusta el mensaje de null
        return "el numero debe ser entre 0 y 99";
    }

}
