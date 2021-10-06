import java.util.*;
public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int numMayor;
		int numMenor;
		int contador = 0;
		int total= 0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduzca número entero, si es 0 el programa finalizará: $ ");
		num = input.nextInt();
		numMayor = num;
		numMenor = num;
		
		
		
		while ( num != 0) {
			
			if ( num > numMayor) {
				numMayor = num;
				contador++;
			}
			else if ( num < numMenor) {
				numMenor = num;
				contador++;
			}
			else {
				contador++;
				total += num;
			}
			System.out.println("Introduzca otro número entero, si es 0 el programa finalizará: $ ");
			num = input.nextInt();
		}
		
		
		System.out.println("Ha introducido un 0, Programa finalizado, estos han sido sus resultados:");
		
		System.out.println("\n\n============================================");
		
		System.out.println("Número más alto = " + numMayor + "\n");
		System.out.println("Número más bajo = " + numMenor + "\n");
		System.out.println("Media aritmética de todos los números = " + (total / contador ) + "\n");
		
		
		System.out.println("============================================");
		input.close();
	}

}

/*

Ejercicio 33
Escribe un programa que lea número hasta que se introduzca un cero. Al final, debe indicarnos cuál ha sido el mayor número introducido, cuál el menor y la media aritmética de todos los introducidos.
*/
