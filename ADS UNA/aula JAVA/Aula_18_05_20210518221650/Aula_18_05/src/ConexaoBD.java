

import java.sql.*;

public class ConexaoBD {
	
	// atributos
	private static Connection conexao = null;
	//esta é a variável fonte recebe o mesmo nome da base de dados
	//criada no postgresql
	private String fonte = "MiniCurso";
	//Conexao Para a Base de Dados do PostgresSQL utilizando JDBC
	private ConexaoBD() {
	
		try {
		
		//Driver para fazer conexao com um Banco mysql
		
		Class.forName("org.mysql.Driver");
		
		//comando para fazer conexao via JDBC com um banco postgresql
		//sendo informado o servidor e sua porta, no caso localhost na porta 5432
		// + o nome da base de dados, o usuario e a senha.
		
		conexao = DriverManager.getConnection("mysql://localhost/" +
		fonte, "usuario do banco", "senha do banco");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Ocorreu um erro de class não encontrada!!!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ocorreu um erro na conexao com o banco de dados!!!");
		}
	}
	
	
	public static Connection getInstance() {
		if (conexao == null) {
			new ConexaoBD();
		}
		return conexao;
	}
}


/* 
 * EXPLICAÇÕES E COMENTÁRIOS SOBRE O CÓDIGO
 *
 
 
public class ConexaoBD {

	// atributos
	private static Connection conexao = null;
	//esta é a variável fonte recebe o mesmo nome da base de dados
	//criada no postgresql
	private String fonte = "MiniCurso";
	//Conexao Para a Base de Dados do PostgresSQL utilizando JDBC
	private ConexaoBD() {
	
		try {
		
		//Driver para fazer conexao com um Banco mysql
		
		Class.forName("org.mysql.Driver");
		
		//comando para fazer conexao via JDBC com um banco postgresql
		//sendo informado o servidor e sua porta, no caso localhost na porta 3306
		// + o nome da base de dados, o usuario e a senha.
		
		conexao = DriverManager.getConnection("mysql://localhost:3306/" + fonte, "usuario do banco", "senha do banco");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Ocorreu um erro de class não encontrada!!!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ocorreu um erro na conexao com o banco de dados!!!");
		}
	}
	
	
	
	public static Connection getInstance() {
	
		if (conexao == null) {
			new ConexaoBD();
		}
		
		return conexao;
		
	}
}


 * 
 * 
 */