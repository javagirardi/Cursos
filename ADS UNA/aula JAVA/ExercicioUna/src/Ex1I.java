
public class Ex1I {

	public static void main(String[] args) {

		int ant = 1, pos = 1, aux;

		for (int i = 1; i <= 15; i++) {

			System.out.print(ant + ", ");
			aux = ant + pos;
			ant = pos;
			pos = aux;

		}

	}

}
