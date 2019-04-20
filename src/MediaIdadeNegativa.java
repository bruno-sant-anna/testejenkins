import java.util.Locale;
import java.util.Scanner;

public class MediaIdadeNegativa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int cont = 0;
		int somaIdade = 0;
		
		if(idade > 0) {
			
			while(idade >= 0) {
				
				somaIdade += idade;
				
				idade = sc.nextInt();
				
				cont = cont + 1;
			}
			
			double mediaIdade = (double) somaIdade / cont;
			System.out.printf("%.2f", mediaIdade);
			
		} else {
			System.out.println("Impossível Calcular");
		}

		
		sc.close();
	}

}
