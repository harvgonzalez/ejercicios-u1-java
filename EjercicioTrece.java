import java.util.Scanner;

public class EjercicioTrece {

	public static void main(String[] args) {
		// Declaracion variable
		int year;
		
		// Iniciación del stream
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cálculo de año bisiesto, ingrese año: ");
		year = input.nextInt();
		
		if( (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0) ) {
			System.out.println("Enhorabuena " + year + " es año bisiesto!");
		}
		else {
			System.out.println("Lo sentimos " + year + " no es año bisiesto intenta de nuevo...");
		}
		// Finalización del stream
		input.close(); 

	}

}

/*

Ejercicio 13
Escribe un programa que solicite la introducción de un año y nos diga si es bisiesto o no.
Un año es bisiesto si es divisible por 4, a excepción de aquellos años que son divisibles por 100 pero no por 400.

*/