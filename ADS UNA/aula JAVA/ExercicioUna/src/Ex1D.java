
public class Ex1D {

	public static void main(String[] args) {

		int somapar = 0;

		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 0)
				somapar = somapar + i;
			System.out.println("A soma dos pares de 1 a 500 é " + somapar);

		}

	}

}
