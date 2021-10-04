
import java.util.Scanner;

public class EjercicioDieciseis {

	public static void main(String[] args) {
		
		int num;
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("introduce numero");
		num = input.nextInt();
		
		if( num % 2==0) {
			System.out.println("Par");
		}
		else if( num % 2 !=0) {
			System.out.println("Impar");
		}
		
		input.close();
	}

}

/*
 * 
 * Ejercicio 16
Haz un programa que nos diga si un número introducido por teclado es par o inpar
 */
