import java.util.Scanner;

public class Ex3E {

	public static void main(String[] args) {

		double real, cotacao, conversao;

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos R$ você tem? ");
		real = sc.nextDouble();
		System.out.println("Qual é a cotação de hoje? ");
		cotacao = sc.nextDouble();

		conversao = real / cotacao;

		System.out.printf("Você tem $" + conversao + " dólares.");

		sc.close();

	}

}
