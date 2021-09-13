package Composicao;

public class Automovel {
		
		private Motor motor;
		private Direcao direcao;
		
		Automovel(){}
		public Automovel(float potencia, String chassi, String combustivel, String fabricante, 
				         String cor, float tamanhoRaio, boolean kitMultimidia) {
			
			//O objeto parte pertence a um só objeto todo. 
			//Qualquer remoção do todo é considerada um efeito cascata nas partes
			this.motor = new Motor(potencia, chassi, combustivel, fabricante);
			this.direcao = new Direcao(cor, tamanhoRaio, kitMultimidia);
		}   
		
		
		public Motor getMotor() {
			return motor;
		}
		public void setMotor(Motor motor) {
			this.motor = motor;
		}
		public Direcao getDirecao() {
			return direcao;
		}
		public void setDirecao(Direcao direcao) {
			this.direcao = direcao;
		}
		
		public String toString() {
			return this.motor.toString() + this.direcao.toString();
		}

}
