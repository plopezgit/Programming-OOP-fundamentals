import java.util.*;
public class M5Exe4ReservaTiteres {

	public static void main(String[] args) {
		/* Haz un programa que pida por consola cuántos niños y niñas 
		 * queremos introducir para hacer una reserva de una actuación de títeres.
		 * Una vez que sabemos el número de niños y niñas debes pedir sus edades. 
		 * Las edades sólo pueden estar comprendidas entre 5 y 12 años, por tanto, 
		 * si al pedir una edad, el usuario/a introduce una que no está en este rango, 
		 * debes volver a pedirla (hasta que introduzca una correcta).
		 * Por último, debes mostrar por pantalla la media de edades de los niños.
		 */
		
		//Declaracion
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> listaDeEdades = new ArrayList<Integer>();
		int numChicosReserva;
		int edad;
		int edadReserva;
		double sumatorioEdad=0;
		
		//Input
		
		System.out.println("Cuando chicos van al acto?");
		numChicosReserva = input.nextInt();
		
		//Bucle de Input y analisis
		while (listaDeEdades.size() != numChicosReserva) {	
			System.out.println("Dime su edad (5-12)" );
			edad = input.nextInt(); 
			
			if (edad >=5 && edad <13) {
				
				listaDeEdades.add(edad);
				
			}
		}
	
		for (int i=0; i<numChicosReserva; i++) { 
		
			edadReserva = listaDeEdades.get(i); //Simple!! Gracias Luis/Lex, pues yo me habia salido del scope buscando otros metodos que aun no estan a mi nivel
			sumatorioEdad += edadReserva;
			
			
		}
		System.out.println("Promedio de edades: " + sumatorioEdad/numChicosReserva);
		//Output
		
		//mediaEdad= listaDeEdades.stream().mapToInt(o -> o.intValue()).average();
		//	System.out.println(mediaEdad);
	}
}
