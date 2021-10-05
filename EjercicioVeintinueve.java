import java.util.Scanner;

public class EjercicioVeintinueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		String caracter;
		String[] vocales  = {"a", "e", "i", "o", "u"}; 
		
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
Ejercicio 29
Escribe un programa que lea caracteres que introduce un usuario y cuente el número de cada una de las vocales que introduzca.
El programa termina cuando el usuario introduzca un asterisco, momento en el cual se debe imprimir el recuento de cada una de las vocales, el total de letras introducidas y el número de letras que no eran vocales.
*/