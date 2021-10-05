
import java.util.Scanner;

public class EjercicioVeinticuatro {

	public static void main(String[] args) {
		int contador = 0;
		String caracter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca caracter: ");
		caracter = input.next();
		
		
		while ( !caracter.equals("*")) {
	
			System.out.println("Intentar de nuevo: ");
			caracter = input.next();
			contador++;
		}
		
		System.out.println("Ha tenido " + contador + " intentos");
	
		
		
		
		input.close();

	}

}

/*
Ejercicio 24
Escribe un programa que lea caracteres hasta que se introduzca un asterisco. Después imprime en pantalla el número de caracteres introducido.
*/