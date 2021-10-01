
import java.util.Scanner;

public class EjercicioDos {

	public static void main(String[] args) {
		// 
		
		int a, b;
		
		
		// Inicio stream
		Scanner userInput = new Scanner(System.in);
		
		//
		System.out.println("Escriba número uno:");
		a = userInput.nextInt();
		
		System.out.println("Escriba número dos:");
		b = userInput.nextInt();
		
		int total = a+ b;
		System.out.println("La suma  de " + a +" + " + b + " es igual a " + total);
	}

}

/*1

Crea un programa escriba por pantalla la suma de dos números enteros
asignados a dos variables de ése mismo tipo.
*/