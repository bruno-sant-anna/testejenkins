import java.util.Scanner;

public class TipoDeCombustivel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int totalAlcool = 0; 
		int	totalGasolina = 0; 
		int totalDiesel = 0;
		
		int combustivel = sc.nextInt();
		
		while (combustivel != 4) {
			
			if (combustivel == 1) {
				totalAlcool ++;
				
			} 
			
			else if (combustivel == 2) {
				totalGasolina ++;
			} 
			
			else if (combustivel == 3) {
				totalDiesel ++;
			} else {
				System.out.println("Código invalido, informe de 1-4");
			}
			
			combustivel = sc.nextInt();
			
		}
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + totalAlcool);
		System.out.println("Gasolina: " + totalGasolina);
		System.out.println("Diesel: " + totalDiesel);
		
		sc.close();
	}

}
