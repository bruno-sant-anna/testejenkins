import java.util.Scanner;

public class ValidarSenha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha;
		
		senha = sc.nextInt();
		
		while (senha != 2202) {
			System.out.println("Senha Invalida");

			senha = sc.nextInt();

		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
