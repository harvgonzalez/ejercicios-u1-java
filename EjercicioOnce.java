
import java.util.Scanner;

public class EjercicioOnce {

	public static void main(String[] args) {
		// variables
		String nombre;
		
		// stream
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Escriba nombre: ");
		nombre = userInput.next();
		System.out.println("Hola " + nombre);
		
		// Final Stream
		
		userInput.close();

	}

}

/*
Ejercicio 11
Realiza un programa que lea un nombre y escriba en pantalla: Hola <nombre>
*/