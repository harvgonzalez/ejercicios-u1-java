
public class EjercicioVeintiuno {
	
	public static void Fibonacci(int n) {
		int num1 = 0;
		int num2 = 1;
		
		int contador = 0;
		  
        // Iterate till counter is N
        while (contador < n && num1 < 10) {
  
            // imprime valor de num1
        
           System.out.println("num1 es:  " + num1 + "  |" + " num2 es: " + num2 + " | num3 es:");
           
  
            // Cambio de  valores
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            contador = contador + 1;
            System.out.print(num3);
            System.out.println(" Esta es la iteración nº" +contador +  "\n");
        }
        return;
		
	}

	public static void main(String[] args) {
		

		// numero  n  dado
        int n = 10;
  
        // Function Call
        Fibonacci(n);

	}

}

/*
 * Ejercicio 21
Haz un programa que escriba en pantalla los primeros 10 números de la serie de Fibonacci.
 */

