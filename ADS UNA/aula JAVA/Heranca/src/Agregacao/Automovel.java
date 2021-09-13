package Agregacao;

public class Automovel extends Terrestre {
	private String cor;
	private int numPortas;
	private String placa;
	private Motor motor;
	private Direcao direcao;
	
	Automovel(){}
	public Automovel(Motor motor, Direcao direcao) {
		this.motor = motor;
		this.direcao = direcao;
	}   
	public Automovel(Motor motor) {
		this.motor = motor;
	}
	
	public void setCor(String cor) {
		this.cor=cor;
	}
	public String getCor() {
		return cor;
	}
	public void setNumPortas(int numPortas ) {
		this.numPortas = numPortas;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public void setPlaca(String placa) {
		this.placa=placa;
	}
	public String getPlaca() {
		return this.placa;
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
