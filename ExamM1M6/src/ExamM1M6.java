import java.util.ArrayList;

public class ExamM1M6 {

	public static void main(String[] args) {

	//A)
	ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
	listaNumeros.add(8); listaNumeros.add(12); listaNumeros.add(5); listaNumeros.add(22); 
	listaNumeros.add(6);
	
	System.out.println("Numero más pequeño " + listaNumeros.get(printNumeroMayorGetIndiceMenor(listaNumeros)));
	
	//B)
	ArrayList<String> listaNombres = new ArrayList<String>();
	listaNombres.add("Noa"); listaNombres.add("Peter"); listaNombres.add("Victoria"); 
	listaNombres.add("Dani"); listaNombres.add("Sara");
	
	System.out.println("Nombre mas largo " + listaNombres.get(getIndiceNombreMasLargo(listaNombres)));
	
	//C)
	int num1 = 2;
	int num2 = 10;
	System.out.print("Los números comprendidos entre " + num1 + " y " + num2 + " son: ");
	for (int i=0; i<crearListaNumerosEntre(num1, num2).size(); i++) {
		System.out.print(crearListaNumerosEntre(num1, num2).get(i) + " ");
	}
	System.out.println("\n");
	
	//D)
	ArrayList<Character> listaCaracteres = new ArrayList<Character>();
	listaCaracteres.add('A'); listaCaracteres.add('U'); listaCaracteres.add('T'); 
	listaCaracteres.add('O'); listaCaracteres.add('E');
	
	System.out.println("La letra se encuentra en el índice: " + getIndiceChar(listaCaracteres, 'T'));
	System.out.println("La letra se encuentra en el índice: " + getIndiceChar(listaCaracteres, 'N'));
	
	
	}

	public static int printNumeroMayorGetIndiceMenor (ArrayList<Integer> listaNumeros) {
		int comparadorAux = 0;
		int numMayor = 0;
		int indexMenor = 0;
		for (int i =0; i!= listaNumeros.size(); i++ ) {
			if (listaNumeros.get(i) > comparadorAux) {
				comparadorAux = listaNumeros.get(i);
				numMayor = listaNumeros.get(i);
			}
			else {
				indexMenor = i;
			}
		}
		System.out.println("Número más grande: " + numMayor);
		/*for (int i =0; i!= listaNumeros.size(); i++ ) {
			if (listaNumeros.get(i) < comparadorAux) {
				comparadorAux = listaNumeros.get(i);
				indexMenor = i;
			}
		}*/
		return indexMenor;
	}
	
	public static int getIndiceNombreMasLargo (ArrayList<String> listaNombres) {
		int comparadorAux = 0;
		int indexMayor = 0;
		for (int i =0; i!= listaNombres.size(); i++ ) {
			if (listaNombres.get(i).length() > comparadorAux) {
				comparadorAux = listaNombres.get(i).length();
				indexMayor = i;
			}
		}
		return indexMayor;
	}
	
	public static ArrayList<Integer> crearListaNumerosEntre (int num1, int num2) {
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		for (int i=num1+1; i<num2; i++) {
			listaNumeros.add(i);
		}
		return listaNumeros;
	}

	public static int getIndiceChar (ArrayList<Character> listaCaracteres, char x) {
		int index = -1;
		int i = 0;
		//boolean match = false;
		while (index==-1 && i != listaCaracteres.size()) {
			if(listaCaracteres.get(i)!=x) {
				//match = false;
				index=-1;
				i++;
			} else {
				//match = true;
				index= i;
			}
		}
		return index;
	}	
	
}
