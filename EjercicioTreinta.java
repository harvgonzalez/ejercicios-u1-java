import java.util.Scanner;

public class EjercicioTreinta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// variables
		String palabra = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escriba una palabra por favor: ");
		
		palabra = input.nextLine();
		
		System.out.println(palabra + " contiene " + (palabra.length()) + " caracteres.");
		
		input.close();
	}

}

/*
Ejercicio 30
Escribe un programa que cuente el número de caracteres que tiene una palabra que haya introducido el usuario.
Consulta la referencia Java para poder localizar algún método que realice esta función.

*/