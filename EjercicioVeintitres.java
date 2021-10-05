
public class EjercicioVeintitres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phoneNum = "936020102";
		System.out.println(phoneNum.charAt(0));
		System.out.println(phoneNum.length());
		
		if( (phoneNum.charAt(0) == '6' || phoneNum.charAt(0) == '7') && phoneNum.length() == 9) {
			
			System.out.println("Número válido");
			
		}
		else {
			System.out.println("No válido");
		}
	}

}

/*
Ejercicio 23
Escribe un programa que lea un número de teléfono y nos diga si es un número móvil o no.
Utiliza el método charAt() de la clase String. Busca su referencia en Internet.
*/