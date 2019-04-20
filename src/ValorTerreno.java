import java.util.Locale;
import java.util.Scanner;

public class ValorTerreno {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor da Largura - ");
		double largura = sc.nextDouble();
		
		System.out.println("Informe o valor da Comprimento - ");
		double comprimento = sc.nextDouble();
		
		System.out.println("Informe o valor da Metro Quadrado - ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		
		double valor = area * metroQuadrado;
		
		System.out.printf("A area do terreno é %.2f%n", area);
		
		System.out.printf("O preço do terreno é %.2f%n", valor);
		
		sc.close();
	
	}

}
