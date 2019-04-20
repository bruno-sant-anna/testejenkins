import java.util.Locale;
import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Double x = sc.nextDouble();
		
		Double y = sc.nextDouble();
		
		Double z = sc.nextDouble();
		
		Double mediaPond = (x * 2.0 + y * 3.0 + z * 5.0) / 10;
		
		System.out.printf("MEDIA = %.1f\n", mediaPond);
		
		sc.close();
	}

}
