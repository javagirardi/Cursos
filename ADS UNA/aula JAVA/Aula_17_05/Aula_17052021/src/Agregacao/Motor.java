package Agregacao;

public class Motor {
	//atributos
	private float potencia;
	private String chassi;
	private String combustivel;
	private String fabricante;
	
	//metodos construtores
	Motor(){ //sem par�metros
	}
	public Motor(float potencia, String chassi) {//2 par�metros
		this.potencia = potencia;
		this.chassi = chassi;
	}
	public Motor(float potencia, String chassi, String combustivel) {//3 par�metros
		this.potencia = potencia;
		this.chassi = chassi;
		this.combustivel = combustivel;
	}
	
	//metodos setters e getters
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
	public float getPotencia() {
		return this.potencia;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getChassi() {
		return this.chassi;
	}
	
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getCombustivel() {
		return this.combustivel;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getFabricante() {
		return this.fabricante;
	}
	
	public String toString( ) {
		return "\nPotencia: "+this.potencia+"\nChassi: "+this.chassi+"\nCombustivel: "+this.combustivel;
	}

}
