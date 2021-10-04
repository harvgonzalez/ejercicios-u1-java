
import java.util.Scanner;
public class EjercicioCatorce {

	public static void main(String[] args) {
		
		int num;
		String[] numTexto = { "Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve" };
		
		// Inicio stream input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Eliga un numero del 0-9: ");
		num = input.nextInt();
		
		if( num <0 || num > 9 ) {
			System.out.println("Error! el numero solo puede ir del 0-9: ");
		}
		else {
			System.out.println(numTexto[num]);
		}
		
		//Final del input
		
		input.close();
	}

}

/*
 * 
 * Ejercicio 14
Escribe un programa que lea un número del 0 al 9 y escribe su valor en texto.
 */
