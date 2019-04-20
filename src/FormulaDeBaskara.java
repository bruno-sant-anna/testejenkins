import java.util.Scanner;

public class FormulaDeBaskara {
	
	public static void main(String[] args) {

		
		double delta, x1, x2, a = 1, b = -5, c = 6;
	
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println(delta);
		System.out.println(x1 + x2);
		
	}
}
