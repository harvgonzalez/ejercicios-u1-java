import java.util.Scanner;

public class EjercicioOcho {

	public static void main(String[] args) {
		
		int x, y;
		String operador;
		float resultado = 0;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Eliga primer número: ");
		x = userInput.nextInt();
		
		System.out.println("Eliga operador suma/resta/multiplicacion/division con uno de estos caracteres +/-/x/:");
		operador = userInput.next();
		
		System.out.println("Eliga segundo número: ");
		y = userInput.nextInt();
		
		switch (operador)
		{
		case "+": resultado = x + y; break;
		case "-": resultado = x - y; break;
		case "x": resultado = x * y; break;
		case ":": resultado = x / y; break;
		
		default: System.out.println("Ha habido un error, revise datos ingresados");
		}
		
		System.out.println( resultado );
		// cerrar stream
		userInput.close();

	}

}

/*
 Ejercicio 7
Haz un programa que declare dos variables, una String y otra numérica. Asígnales un nombre propio y una edad. Después escribe en pantalla:
<Nombre> <Edad> años
[Hay un espacio en blanco entre el nombre y la edad, y entre la edad y el literal “años”. Lo indicado entre los signos menor y mayor hacer referencia al valor que tengan las variables. No hay que imprimir los signos mayor ni menor.] 
  */
 