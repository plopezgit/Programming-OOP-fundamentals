
public class M71Exe5Pares0100 {

	public static void main(String[] args) {
		/*Muestra por pantalla los números pares comprendidos entre el 100 y el 0 
		 * en orden descendente.
		 */

		System.out.println(GetPares(100));
		
	}
	
	public static String GetPares (int limit) {
		String listaPares= "";
		for (int i=limit; i!=0; i-=2) {
				listaPares += i;
				listaPares += " ";
			}
		return listaPares;
	}

}
