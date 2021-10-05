import java.util.Scanner;

public class EjercicioVeintisiete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables
		double num1, num2;
		String operador;
				
		// Principio del input
		Scanner input = new Scanner(System.in);
						
		// lectura num1
		System.out.print( "Elige dos números enteros separados por un espacio $ " );
		num1 = input.nextInt();
		num2 = input.nextInt();
				
		System.out.print( "Elige operación aritmética +/-/x/: $" );
		operador = input.next();
				
				
		if( num2 == 0 && operador.equals(":")) {
					
           System.out.println("Error! división entre cero");
					
         }
				
				
		switch ( operador ) {
			case "+": System.out.println(Math.round(num1) + " + " +  Math.round(num2) + " = " + (num1 + num2)  ); break;
			case "-": System.out.println(Math.round(num1) + " - " +  Math.round(num2) + " = " + (num1 - num2)  ); break;
			case "x": System.out.println(Math.round(num1) + " x " +  Math.round(num2) + " = " + (num1 * num2)  ); break;
			case ":": System.out.println(Math.round(num1) + " : " +  Math.round(num2) + " = " + (num1 / num2)  ); break;
			default: System.out.println("Error"); break;
		}
				
				
				
		// Cierra  stream
		input.close();

	}

}

/*
Ejercicio 27
Modifica el programa anterior para que no realice una división cuando el divisor sea cero. En dicho caso, mostrará un aviso por pantalla: “División por cero.”

*/