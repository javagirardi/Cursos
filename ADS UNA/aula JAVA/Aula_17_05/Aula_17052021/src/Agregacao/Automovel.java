package Agregacao;

public class Automovel {

	private Motor motor;
	private Direcao direcao;

	Automovel() {
	}

	public Automovel(Motor motor, Direcao direcao) {
		this.motor = motor;
		this.direcao = direcao;
	}

	public Automovel(Motor motor) {
		this.motor = motor;
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
