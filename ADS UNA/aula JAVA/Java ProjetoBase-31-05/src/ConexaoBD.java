import java.sql.*;

public class ConexaoBD {

	// atributos
	private static Connection conexao = null;
	// esta é a variável fonte recebe o mesmo nome da base de dados
	// criada no postgresql
	private String fonte = "AULA_BD";

	// Conexao para a Base de Dados do MySQL utilizando JDBC
	private ConexaoBD() {

		try {

			// Driver para fazer conexao com um Banco mysql
			

			// comando para fazer conexao via JDBC com um banco MySQL
			// sendo informado o servidor e sua porta, no caso localhost na porta 3306
			// + o nome da base de dados, o usuario e a senha.

			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + fonte, "root", "senha");

		
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
