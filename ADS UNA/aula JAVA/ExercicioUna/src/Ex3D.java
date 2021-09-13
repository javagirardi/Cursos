import java.util.Scanner;

public class Ex3D {

	public static void main(String[] args) {

		int A, B, C, potA, potB, potC, soma;

		Scanner sc = new Scanner(System.in);

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		potA = A * A;
		potB = B * B;
		potC = C * C;

		soma = potA + potB + potC;

		System.out.println("A soma dos quadrados dos números digitados é " + soma);
		
		sc.close();

	}

}
