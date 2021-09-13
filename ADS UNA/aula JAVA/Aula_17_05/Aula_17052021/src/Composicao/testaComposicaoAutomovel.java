package Composicao;
//As partes pertencem a um todo

public class testaComposicaoAutomovel {

	public static void main(String[] args) {
		
		//composição do carro - os objetos partes pertencem a um todo
		Automovel carro = new Automovel(2.0f,"123abc","gasolina","Fiat","branca",23.f,false);
			
		if (carro.getDirecao().getKitMultimidia() ==  true)
			System.out.println("O carro possui kit multimidia");
		else
			System.out.println("O carro não possui kit multimidia");
		
		System.out.println(carro.toString());
		
		
		//Automovel moto = new Automovel();
		
		//Automovel aviao = new Automovel();
		
		

	}

}
