
public class Ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		
		for (int i = 10; i>0; i--) {
			
			if ( i == 1 ) {
				System.out.print(i + " = ");
			}
			else{
				System.out.print(i + " * ");
				num *=i;
			}
			
		}
		
		System.out.println(num);
	}

}

/*

*/