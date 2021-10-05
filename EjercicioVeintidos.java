
import java.util.Scanner;

public class EjercicioVeintidos {
	
	public static void Fibonacci(int n) {
		int num1 = 0;
		int num2 = 1;
		
		int contador = 0;
		  
        // Iterate till counter is N
        while (contador < n) {
  
            // imprime valor de num1
        
           System.out.print(num1 + " ");
           
  
            // Cambio de  valores
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            contador = contador + 1;
            
        }
        return;
		
	}

	public static void main(String[] args) {
		

		// numero  n  dado
        int n;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Type how many fibonnaci numbers you want: ");
        n = input.nextInt();
        // Function Call
        Fibonacci(n);

	}

}
/*
Ejercicio 22
Modifica el anterior programa para que sea el usuario quien indique cuántos números de la serie quiere ver por pantalla.
*/