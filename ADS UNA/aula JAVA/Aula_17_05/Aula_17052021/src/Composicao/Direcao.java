package Composicao;

public class Direcao {
	//atributos
		private String cor;
		private float tamanhoRaio;
		private boolean kitMultimidia;
	
		//construtores
		public Direcao(String cor, float tamanhoRaio, boolean kitMultimidia) {
			this.cor = cor;
			this.tamanhoRaio = tamanhoRaio;
			this.kitMultimidia = kitMultimidia;
		}
		public Direcao(String cor, float tamanhoRaio) {
			this.cor=cor;
			this.tamanhoRaio=tamanhoRaio;
		}		
		public Direcao() {	
		}
		
		public Direcao(boolean kitMultimidia) {
			this.kitMultimidia=kitMultimidia;
		}
		
		//demais m�todos
		public void setCor(String cor) {
			this.cor=cor;
		}
		public String getCor() {
			return cor;
		}
		public void setTamanhoRaio(float tamanhoRaio ) {
			this.tamanhoRaio=tamanhoRaio;
		}
		public float getTamanhoRaio() {
			return tamanhoRaio;
		}
		public void setKitMultimidia(boolean kitMultimidia) {
			this.kitMultimidia=kitMultimidia;
		}
		public boolean getKitMultimidia() {
			return kitMultimidia;
		}
		
		public String toString( ) {
			String resp;
			if (this.kitMultimidia)
				resp = "possui";
			else
				resp = "nao possui";
				
			return "\nCor: "+this.cor+"\nTamanho do raio: "+this.tamanhoRaio+"\nKit multimidia: "+resp;
		}
		
}
