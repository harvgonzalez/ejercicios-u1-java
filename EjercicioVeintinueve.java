import java.util.Scanner;

public class EjercicioVeintinueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadorLetras = 0;
		int contadorVocales=0;
		int contadorA =0; 
		int contadorE = 0; 
		int contadorI = 0; 
		int contadorO = 0;
		int contadorU = 0;
		
		
		// int contadorE = 0;
		// int contadorI = 0;
		// int contadorO = 0;
		// int contadorU = 0;
		
		
		String caracter;
		// String[] vocales  = {"a", "e", "i", "o", "u"}; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca letra/vocal: ");
		caracter = input.next();
		
		
		while ( !caracter.equals("*")) {
						
			if( caracter.equalsIgnoreCase("a") ) {
				contadorA++;
				contadorVocales++;
				
			}
			else if ( caracter.equalsIgnoreCase("e") ) {
				
				contadorE++;
				contadorVocales++;
				
			}
			else if ( caracter.equalsIgnoreCase("i") ) {
				contadorI++;
				contadorVocales++;
				
				
			}
			else if ( caracter.equalsIgnoreCase("o") ) {
				
				contadorO++;
				contadorVocales++;
				
			}
			else if ( caracter.equalsIgnoreCase("u") ) {
				contadorU++;
				contadorVocales++;
			}
			
	
			else {

				contadorLetras++;
			}
			
			System.out.println("Ingrese otra letra/vocal o termine pulsando *:  $ ");
			caracter = input.next();
		}
		System.out.println("===============================================");
		System.out.println("\n\n\nHa escrito " + contadorLetras + " letras y " + contadorVocales + " vocales...\n");
		
		System.out.println("===============================================");
		System.out.println("Con la a: " + contadorA);
		System.out.println("Con la e: " + contadorE);
		System.out.println("Con la i: " + contadorI);
		System.out.println("Con la o: " + contadorO);
		System.out.println("Con la u: " + contadorU);
		
		System.out.println("===============================================");
		
		
		
		input.close();

	}

}

/*
Ejercicio 29
Escribe un programa que lea caracteres que introduce un usuario y cuente el número de cada una de las vocales que introduzca.
El programa termina cuando el usuario introduzca un asterisco, momento en el cual se debe imprimir el recuento de cada una de las vocales, el total de letras introducidas y el número de letras que no eran vocales.
*/