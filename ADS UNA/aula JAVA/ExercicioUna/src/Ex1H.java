import java.util.Scanner;

public class Ex1H {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int b, e, resultado;

		System.out.println("Digite a base ");
		b = s.nextInt();
		System.out.println("Digite o expoente ");
		e = s.nextInt();

		resultado = 1;

		for (int i = 0; i < e; i++) {
			resultado = resultado * b;

			
		}

		System.out.println("A base elevada ao expoente é " + resultado);
		
		s.close();
	}

}
