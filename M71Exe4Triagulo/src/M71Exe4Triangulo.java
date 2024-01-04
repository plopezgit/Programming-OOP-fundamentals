
public class M71Exe4Triangulo {

	public static void main(String[] args) {
		/* Crea un método que debe recibir como parámetros los lados de un 
		 * triángulo. La función debe devolver un mensaje indicando si el triángulo 
		 * es equilátero, isósceles o escaleno.
		 */

		System.out.println(evaluadorTipoTriangulo(2,2,2));
		
	}
	
	public static String evaluadorTipoTriangulo (int lado1, int lado2, int lado3) {
		String result;
		if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
			result= "Escaleno";
		}
		else if (lado1 == lado2 && lado2 != lado3 || lado3 == lado2 && lado3 != lado1 
				|| lado1 == lado3 && lado1 != lado2) {
			result="Isosceles";
		} else {
			result="Equilatero";
		}
		return result;
	}
}
