import java.util.Scanner;

public class Ex3B {

	public static void main(String[] args) {

		int prodA, prodB;
		double desconto1, desconto2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos produtos 'A' voc� quer adquirir? ");
		prodA = sc.nextInt();
		System.out.println("Quantos produtos 'B' voc� quer adquirir? ");
		prodB = sc.nextInt();

		int totalCompra = prodA * 10 + prodB * 20;
		desconto1 = (prodA * 10 + prodB * 20) * 0.15;
		desconto2 = (prodA * 10 + prodB * 20) * 0.10;

		System.out.println(totalCompra);

		if (prodA >= 1 && prodB >= 1) {
			System.out.println(desconto1);

		} else if (prodA >= 1 || prodB >= 1) {
			System.out.println(desconto2);

		} else
			System.out.println("N�o h� desconto");

		sc.close();
	}

}
