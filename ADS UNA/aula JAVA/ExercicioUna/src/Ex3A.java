import java.util.Scanner;

public class Ex3A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		String sexo;

		System.out.println("Por favor, digite o seu nome: ");
		nome = sc.next();
		System.out.println("Por favor, digite 'F' de for do gênero FEMININO; e digite 'M' se for do gênero MASCULINO: ");
		sexo = sc.next();

		if (sexo != "F") {
			System.out.println("Ilmo. Sr. " + nome);
		} else
			System.out.println("Ilma Sra. " + nome);

		sc.close();

	}

}
