import java.util.Scanner;

public class Ex3C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N;
		int soma = 0;

		N = sc.nextInt();
		System.out.println("Digite um valor inteiro para 'N' " );

		for (int i = 1; i <= N; i++) {
			soma = soma + i;
			System.out.println("A soma dos números é " + soma);

			sc.close();
		}

	}

}
