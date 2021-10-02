import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EjercicioDoce {

	public static void main(String[] args) {
		
		int year, month, day;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("type year: ");
		year = userInput.nextInt();
		
		System.out.println("type month 1-12: ");
		month = userInput.nextInt();
		
		System.out.println("type date 1-31: ");
		day = userInput.nextInt();
	
		// Local date
		
		LocalDate start = LocalDate.of(year, month, day);
		LocalDate end = LocalDate.now();
		long years = ChronoUnit.YEARS.between(start, end);
		System.out.println("You are: " + years + " years old"); // 17
		
		if(years < 18) {
			System.out.println("Sorry you are a minor... bye");
		}
		else if(years > 18) {
			System.out.println("How you doing adult person :)");
		}
		else {
			System.out.println("Sorry there's been an error check data :)");
		}
		
		userInput.close();
	}

}
