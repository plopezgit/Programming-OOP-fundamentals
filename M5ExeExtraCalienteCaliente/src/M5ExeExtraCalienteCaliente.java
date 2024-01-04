import java.util.*;

public class M5ExeExtraCalienteCaliente {

	public static void main(String[] args) {
		/* Realizar un juego para adivinar un número aleatorio N entre 1 y 500. 
		 * Si la distancia entre el número a adivinar y el del usuario/a es de 50 o más,
		 * el programa deberá decir: “Fred, frío: tu número es mayor” o 
		 * “Fred, frío: tu número es más pequeño”
		 * Si la distancia entre el número a adivinar y el del usuario/a 
		 * está entre 15 y 50, el programa deberá decir: 
		 * "Tebi, Tebi: tu número es mayor" o "Tebi, Tebi: tu número es más pequeño" 
		 * Y si la distancia entre el número a adivinar y el del usuario/a es 
		 * menor a 15, el programa deberá decir:“Caliente, caliente: tu número es mayor” 
		 * o “Caliente, caliente: tu número es más pequeño”
		 
		 	Linea: -100 -50 -15  0 +15 +50 +100

			If num >0 && <= 15 cal es más gra
			Else if num > 15 && <50 tib más gran
			Else in num >=50 frío fri más gra 
	
			If num <0 && >= -15 cal es más peq
			Else if num < -15 && >-50 tib más peq
			Else in num <=-50 frío frío más peq
		 * 
		 */
		
		//Declaracion:
			Scanner input = new Scanner(System.in);
			int num = 350;
			//int ruleta = (int)Math.ceil((Math.random() * 500));
			int ruleta = 200;
			int diferencial = num - ruleta;

				
		//Input
			System.out.println("Adivina adivinador, dime un numero");
				
				//Logica
				do {
					num = input.nextInt();
					
					diferencial = ruleta - num;
					
					if (diferencial >0 && diferencial < 15) {
						System.out.println("Caliente caliente tu numero es mas pequeño");
					
					} else if (diferencial < 0 && diferencial >= -15) {
						System.out.println("Caliente Caliente tu numero es mas grande");

					} else if (diferencial >= 15 && diferencial < 50) {
						System.out.println("Tibio Tibio tu numero es mas pequeño");

					} else if (diferencial < -15 && diferencial > -50) {
						System.out.println("Tibio Tibio tu numero es mas grande");

					} else if (diferencial >= 50) {
						System.out.println("Frio Frio, tu numero es mas pequeño");

					} else if (diferencial <= -50) {
						System.out.println("Frio Frio, tu numero es muy grande");

					}
											
				} while (ruleta != num);
				
				//Output
				System.out.println("Enhorabuena, el número era " + ruleta);		
	}
}
