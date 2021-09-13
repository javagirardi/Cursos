
public class Pessoa {
	
	int codPessoa;
	String nome;
	String email;
	char sexo;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int codPessoa, String nome, String email, char sexo) {
		this.codPessoa = codPessoa;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
	}

	public int getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	
	

}
