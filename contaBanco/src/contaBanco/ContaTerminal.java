package contaBanco;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US); // locale.US para separar decimais usando . ao inves de ,
		// Insercao de dados do usuario
		// Numero da conta
		System.out.println("Por favor, digite o número da conta !");
		int conta = sc.nextInt();
		sc.nextLine(); //tratar o remanecente do nextInt
		// Numero da agencia
		System.out.println("Por favor, digite o número da Agência !");
		String agencia = sc.nextLine();
		// Nome do cliente
		System.out.println("Por favor, digite o seu nome !");
		String nomeCliente = sc.nextLine();
		// Saldo do cliente
		System.out.println("Por favor, digite o seu saldo !");
		float saldo = sc.nextFloat();
		sc.nextLine(); //tratar o remanecente do nextFloat
		
		// Impressao
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "
				+ 			agencia+", conta "+conta+" e seu saldo "
				+ 			saldo+" já está disponível para saque");
		
	}

}
