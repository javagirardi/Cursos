import java.util.Scanner;

public class Ex3E {

	public static void main(String[] args) {

		double real, cotacao, conversao;

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos R$ voc� tem? ");
		real = sc.nextDouble();
		System.out.println("Qual � a cota��o de hoje? ");
		cotacao = sc.nextDouble();

		conversao = real / cotacao;

		System.out.printf("Voc� tem $" + conversao + " d�lares.");

		sc.close();

	}

}
