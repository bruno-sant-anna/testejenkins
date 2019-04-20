import java.util.Locale;
import java.util.Scanner;

/**
 * URI1002
 * @author Bruno
 *
 */
public class AreaDoCirculo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		double n = 3.14159;
		
		double area = n * (raio * raio);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
		
	}

}
