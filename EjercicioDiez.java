import java.util.Scanner;
import java.lang.Math;

public class EjercicioDiez {

	public static void main(String[] args) {
		// Declaracion de variables
		double radio;
		
		final double PI_CONSTANT = Math.PI;
		// Comienzo stream
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the radio to calculate circumfernece: ");
		radio = userInput.nextDouble();
		
		System.out.println( 2 * PI_CONSTANT * radio);
		
		// Final del stream
		userInput.close();

	}

}

/*
Ejercicio 10
Escribe un programa que calcule la circunferencia de un círculo. Declara la constante Pi y una variable que almacene el radio.
*/