
public class Ex1J {

	float i, f;

	public static void main(String[] args) {
		for (float i = 10; i <= 100; i++) {
			float f = ((9 * i + 160) / 5);

			if (i % 10 == 0)
				System.out.println(i + f);
		}

	}

}
