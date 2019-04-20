import java.util.Locale;
import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float x = sc.nextFloat();
		
		float y = sc.nextFloat();

		
		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("primeiro");

			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");

			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
				
			}
			else if (x > 0 && y < 0) {
				System.out.println("quarto");
			}

			 x = sc.nextFloat();
			
			 y = sc.nextFloat();
			
		}
		
		sc.close();
		
	}

}
