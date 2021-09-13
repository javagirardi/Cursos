package Agregacao;

import java.util.Scanner;

import Composicao.Automovel;
import Composicao.Direcao;
import Composicao.Motor;

public class testaAgrecacaoAutomovel {

	public static void main(String[] args) {

		// array - vetor
		Scanner sc = new Scanner(System.in);
		mensagem("\nQuantos automóveis irá cadastrar? ");
		int n = sc.nextInt();
		Automovel[] carro = new Automovel[n];

		leDados(carro);
		escreveDados(carro);

		// o automóvel de maior potência, seu fabricante e sua cor;
		Automovel aPot = maiorPotencia(carro);
		mensagem("\nO carro de maior potencia tem: \n\tFabricante: " + aPot.getMotor().getFabricante()
				+ "\n\tCor.......: " + aPot.getDirecao().getCor());

		// a potência média
		float potMedia = potenciaMedia(carro);
		mensagem("\nA potência média dos automóveis cadastrados é igual a " + potMedia);

		sc.close();
	}

	public static void mensagem(String texto) {
		System.out.println(texto);
	}

	// entrada de dados
	public static void leDados(Automovel[] carro) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < carro.length; i++) {

			// AGREGAÇÃO: montando as partes

			mensagem("\nEntrada de dados do " + (i + 1) + "º Automóvel");
			// lê dados do motor
			mensagem("\nPotencia.......: ");
			float pot = sc.nextFloat();
			mensagem("\nChassi.........: ");
			String chassi = sc.next();
			mensagem("\nCombustivel....: ");
			String combustivel = sc.next();
			Motor m = new Motor(pot, chassi, combustivel);

			// lê dados da direção
			mensagem("\nCor............: ");
			String cor = sc.next();
			mensagem("\nTamanho do Raio: ");
			float tamanhoRaio = sc.nextFloat();
			mensagem("\nKit Multimídia.: ");
			boolean kitMultimidia = sc.nextBoolean();
			Direcao d = new Direcao(cor, tamanhoRaio, kitMultimidia);

			carro[i] = new Automovel(m, d); // i-ésima instância do objeto Automovel - AGREGAÇÃO

		} // fim do for

		sc.close();
	}

	// impressao de dados do motor e da direção para cada automóvel
	public static void escreveDados(Automovel[] carro) {
		for (int i = 0; i < carro.length; i++) {
			System.out.println(carro[i].toString());
		}
	}

	// o automóvel de maior potência, seu fabricante e sua cor
	public static Automovel maiorPotencia(Automovel[] carro) {

		Automovel mPot = new Automovel();
		mPot = carro[0];
		float pot = mPot.getMotor().getPotencia();
		int pos = 0;

		for (int i = 1; i < carro.length; i++) {
			if (pot < carro[i].getMotor().getPotencia()) {
				pot = carro[i].getMotor().getPotencia();
				pos = i;
			}
		}

		return carro[pos];
	}

	// a potência média
	public static float potenciaMedia(Automovel[] carro) {
		float soma = 0.f;

		for (int i = 0; i < carro.length; i++) {
			soma = soma + carro[i].getMotor().getPotencia();
		}
		return (soma / carro.length);
	}

}
