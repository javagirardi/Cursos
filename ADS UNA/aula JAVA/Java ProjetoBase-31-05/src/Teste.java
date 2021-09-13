import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = null;
		
		String menu = 
		 "\n1. Cadastro de pessoa"
		 +"\n2. Remoção de pessoa"
		 +"\n3. Busca de pessoa pelo e-mail"
		 +"\n4. Relatório de todas as pessoas, considerando o nome em ordem alfabética"
		 +"\n5. Altera pessoa"
		 +"\n6. Cadastro de conta"
		 +"\n7. Remoção de conta"
		 +"\n8. Busca conta pelo código"
		 +"\n9. Relatório de todos as contas"
		 +"\n10. Busca das contas de uma agência"
		 +"\n11. Busca das contas com saldo maior a um dado valor"
		 +"\n12. Altera conta"
		 +"\n13. Sair\n\n";
		
		int opcao = 13;
		
		do {
			System.out.println(menu);
			Scanner lerOpcao = new Scanner(System.in);
			
			System.out.print("Digite uma opção: ");
			opcao = lerOpcao.nextInt(); 
			//ou... opcao = Integer.parseInt(lerOpcao.next());
		
			
			switch(opcao) {
				case 1: {
					Pessoa plida = lerDadosPessoa();
					inserirPessoa(plida, conexao);
					System.out.println("Pessoa Cadastrada.");
					break;
				}
										
				case 2:{
					Scanner ler = new Scanner(System.in);
					String emailDaPessoaSeraRemovida;
					System.out.println("Digite o email da pessoa a ser removida");
					emailDaPessoaSeraRemovida = ler.next();
					ler.close();
					
					removerPessoaPeloEmail(emailDaPessoaSeraRemovida, conexao);
					break;					
				}	
				//PASSO 2
				case 3:{ //busca pessoa pelo e-mail
					String emailBuscado;
					System.out.println("Digite o e-mail da pessoa que será buscada: ");
					emailBuscado = ler.next();
					
					Pessoa pEncontrada = buscarPessoaPeloEmail(emailBuscado);
			
					if(pEncontrada != null) {
						mostraPessoa(pEncontrada;)
					}else {
						System.out.println("Não há pessoa cadastrada com este email.");
					}
					break;
					
				}
				
				case 4:{ 
					break;
				}	
				case 5:{
					break;
				}
				
				case 6:{
			//		Conta lida = lerDadosConta();
			//		inserirConta(lida);
			//		System.out.println("Conta Cadastrada.");
			//		//a completar
			//		break;
			
				}
				
				case 7:{ 
					break;
				}
				//PASSO 2
				case 8:{
					break;
				}
				
				case 9:{
					break;	
				}	
				//PASSO 2
				case 10:{ // buscar conta de uma ag
					String agenciaBuscada;
					System.out.println("Digite a agência a ser buscada: ");
					agenciaBuscada = ler.next();
					
					ArrayList <Conta> vetContas = listaContaDasAgencias(agenciaBuscada);
					System.out.println("Contas encontradas");
					
					for(i=0; i<vetContas.size(); i++) {
						Conta c = vetContas.get(i);
						mostrarConta(c);
						
					}
					break;
				}	
				//PASSO 2
				case 11:{//Busca das contas com saldo maior a um dado valor
					
					float saldoLido;
					System.out.println("Digite o valor de saldo acima do qual deseja buscar as contas: ");
					saldoLido = ler.nextFloat();
					
					ArrayList <Conta> vetContas = listaContasSaldoAcima(saldoLido); 
					System.out.println("CONTAS ENCONTRADAS");
					
					for(int i=0; i<vetContas.size(); ) {
						Conta c = vetContas.get(i);
						mostrarConta(c);
					}

				}
					break;
					
				case 12:{
					break;
				}	
				case 13:{
					System.out.println("\nObrigado por utilizar o Sistema");
					break;
				}
					
				default:{
					System.out.println("\nOpção Inválida!");
					break;
				}
				
						
			}//fim switch
			
			lerOpcao.close();	
		} while (opcao != 13);
							
		
	}
	
	

	//**************************************************
	//métodos para entrada e saída de dados pelo console
	//**************************************************
	
	public static Pessoa lerDadosPessoa(){

		Scanner ler = new Scanner(System.in);
		
		int idPessoa;
		String nome, email;
		float peso;
		
		System.out.println("Digite os dados da pessoa a ser cadastrada");
		
		System.out.print("\nCodigo: ");
				
		idPessoa = ler.nextInt();
		
		System.out.print("\nNome: ");
		nome = ler.next();
		System.out.print("\nEmail: ");
		email = ler.next();
		System.out.print("\nPeso: ");
		peso = Float.parseFloat(ler.next());
						
		Pessoa p = new Pessoa(idPessoa, nome, email, peso);
		
		ler.close();
		
		return p;
		
		
	}
	
	public static Conta lerDadosConta() {
		ler = new Scanner(System.in);
		
		int codConta;
		String numero;
		String agencia, nomeBanco;
		float saldo;
		Pessoa p;
		
		System.out.println("Digite os dados da conta a ser cadastrada");
		
		System.out.print("\nCodigo:");
		codConta = Integer.parseInt(ler.next());
		ler.nextLine();
		System.out.print("\nNúmero da Conta:");
		numero = ler.next();
		System.out.print("\nAgência........:");
		agencia = ler.next();
		System.out.print("\nNome do Banco..:");
		nomeBanco = ler.next();
		System.out.print("\nSaldo..........:");
		saldo = Float.parseFloat(ler.next());
		
		p = lerDadosPessoa();
		
		Conta c = new Conta(codConta, numero, agencia, nomeBanco, saldo, p);
		
		return c;
		
	
	//PASSO 2 **********************!!!!!!!!!!!!!! 
	
	public static void mostraPessoa(Pessoa pEncontrada) {
		System.out.println("Código: "+ pEncontrada.getCodPessoa());
		System.out.println("Nome: "+ pEncontrada.getNome());
		System.out.println("Email: "+ pEncontrada.getEmail());
		System.out.println("Peso: "+ pEncontrada.getPeso());
		
		
	}
	
	//PASSO 2
	
	public static void mostraConta (Conta cEncontrada) {
		
	/*	System.out.println("Código: "+ pEncontrada.getCodPessoa());
		System.out.println("Nome: "+ pEncontrada.getNome());
		System.out.println("Email: "+ pEncontrada.getEmail());
		System.out.println("Peso: "+ pEncontrada.getPeso());
	*/	
		
	}

	//**************************************************
	//métodos para manipulação (persistencia dos dados) no banco de dados
	//**************************************************
	public static void inserirPessoa(Pessoa plida, Connection conexao) throws SQLException {
		conexao = ConexaoBD.getInstance();
		
		String sql = "insert into pessoa (idPessoa, nome, email, peso) values(?,?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setInt(1, plida.getCodPessoa());
		stmt.setString(2, plida.getNome());
		stmt.setString(3, plida.getEmail());
		stmt.setFloat(4, plida.getPeso());
		
		stmt.execute();
		
		stmt.close();
				
		//conexao.close();
		
	}
	
	public static void removerPessoaPeloEmail(String emailDaPessoaSeraRemovida, Connection conexao) 
			throws SQLException {
		conexao = ConexaoBD.getInstance();
		
		String sql = "delete from pessoa where email LIKE ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, emailDaPessoaSeraRemovida);
			
		stmt.execute();
		
		stmt.close();
	}
	
	//PASSO 2
	public static Pessoa buscarPessoaPeloEmail(String emailBuscado) throws SQLException {
		
		conexao = ConexaoBD.getInstance();
		
		String sql = "select * from pessoa where email LIKE ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, emailBuscado);
		ResultSet resultado = stmt.executeQuery(); //importar classe ResultSet para recuperar dados select
		
		Pessoa p = null;
		if(resultado.next()) {
			p = new Pessoa(
					resultado.getInt("idPessoa"),
					resultado.getString("nome"),
					resultado.getString("email"),
					resultado.getFloat("peso"));
		}
		resultado.close();
		
		return p;
		
		
	}
	
	//PASSO 2
	public static ArrayList <Conta> listaContaDasAgencias(String agenciaBuscada)
			throws Exception {
		
		ArrayList <Conta> vetContas = new ArrayList<Conta>(); 
		
		String sql = "select * from conta where agencia like ?)";
		
		PreparedStatement stmt = conexao.prepareStatemant(sql);
		stmt.setString(1, agenciaBuscada);
		ResultSet resultado = stmt.executeQuery();
		
		Conta c = null;
		
		while (resultado.next()) {
			c = new Conta(
				resultado.getInt("codConta"),
				resultado.getString("numero"),
				resultado.getString("agencia"),
				resultado.getString("nomeBanco"),
				resultado.getFloat("saldo")	
					);
			
			vetContas.add(c); //adiciona a conta da agencia busscada
					
		}
		
		
		resultado.close();
		stmt.close();
		
		return vetContas;
	}

	
	//PASSO 2	
		public static ArrayList<Conta> listaContasSaldoAcima(float saldoLido) throws Exception {
		ArrayList<Conta> vetContas = new ArrayList<Conta>();

		Conta vetC[] = new Conta[3];

		conexao = ConexaoBD.getInstance();

		// Por exemplo, SELECT * FROM aula_bd.conta where agencia='1537-6';

		String sql = "select * from conta where saldo > ?)";

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setFloat(1, saldoLido);
		ResultSet resultado = stmt.executeQuery();

		Conta c = null;

		while (resultado.next()) {
			c = new Conta(resultado.getInt("codConta"), resultado.getString("numero"), resultado.getString("agencia"),
					resultado.getString("nomeBanco"), resultado.getFloat("saldo"));

			vetContas.add(c); // adiciona a conta da agencia buscada
		}

		resultado.close();
		stmt.close();

		return vetContas;
	}
	
}




































