import java.util.Scanner;


public class EjercicioVeinticinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
		int num1, num2;
		
		// Principio del input
		Scanner input = new Scanner(System.in);
		
		// lectura num1
		System.out.print( "Elige dos números enteros separados por un espacio" );
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		
		if ( num1 > num2 ) {
			System.out.println("(" + num1 + ")" + ",  " + num2);
		}
		else if ( num2 > num1 ) {
			
			System.out.println(num1 + ",  " + "(" + num2 + ")"  );
		}
		else if ( num1 == num2 ) {
			
			System.out.println(num2 + ",  " + num1);
			
		}
		else {
			System.out.println("Lo siento hubo un error, recuerda separar con un espacio cada número");
		}
		
		System.out.println("num1 es " + num1 + ", num2 es " + num2);
		
		
		// Cierra  stream
		input.close();
		

	}

}

/*
Ejercicio 25

Haz un programa que lea dos números y escriba los dos en pantalla rodeando entre paréntesis el mayor (si lo hay).
Intenta leer los dos números en una sola línea de entrada.

*/