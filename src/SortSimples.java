import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		
		int valor2 = sc.nextInt();

		int valor3 = sc.nextInt();
		
		int a, b, c;
		
		if (valor1 < valor2 && valor1 < valor3) {
			
			a = valor1;
			
			if (valor2 < valor3) {
				b = valor2;
				c = valor3;
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);					

			} else {
				c = valor2;
				b = valor3;				
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);					

			}				

		} else if (valor2 < valor1 && valor2 < valor3) {
			a = valor2;
			
			if (valor1 < valor3) {
				b = valor1;
				c = valor3;
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);					

			} else {
				c = valor1;
				b = valor3;				
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);					

			}				
			
			
		} else {

			a = valor3;
			
			if (valor1 < valor2) {
				b = valor1;
				c = valor2;
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);					

			} else {
				c = valor1;
				b = valor2;				
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);					

			}				

		}
		
		
			System.out.println("");
			System.out.println(valor1);
			System.out.println(valor2);
			System.out.println(valor3);	
			
			
			sc.close();
	}

}
