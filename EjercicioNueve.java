import java.util.Scanner;
import java.lang.Math;


public class EjercicioNueve {

	public static void main(String[] args) {
		
		// Declaración de variables
		double a;
		
		// Comienzo de stream
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		a = userInput.nextInt();
		
		
		// Imprime exponente
		System.out.println("El cuadrado de " + a + " es: " + Math.pow(a, 2));
		
		//  Closing Stream
		userInput.close();

	}

}

/*
Haz un programa que lea un número y escriba su cuadrado. Utiliza este código para leer el número:
Scanner teclado = new Scanner(System.in);
int num=0;
System.out.println ("Introduce un numero: "); num = teclado.nextInt();
*/