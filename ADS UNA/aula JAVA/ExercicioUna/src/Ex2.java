import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int calculo = Fatorial(n);
		System.out.println(calculo);
		sc.close();
	}

	public static int Fatorial(int n) {

		int fat = 1;
		for (int i = 1; i <= n; i++) {
			fat = fat * i;

		}

		return fat;

	}

}
