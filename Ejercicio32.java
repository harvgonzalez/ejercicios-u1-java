import java.util.*;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num;
		double producto = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type the number of products you want: ");
		num = input.nextDouble();
		
		for (double i = num; i>0; i--) {
			
			if ( i == 1 ) {
				System.out.print(i + " = ");
			}
			else{
				System.out.print(i + " * ");
				producto *=i;
			}
			
		}
		
		System.out.println(producto);
		
		input.close();
	}

}


/*
Ejercicio 32
Modifica el programa anterior para que sea el usuario quien diga cuántos números quiere incluir en el producto.
*/