package br.edu.up;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Program {

	public static void main(String[] args) throws SQLException {
				incluir();
	}

 public static void listar() throws SQLException {
	 		//1. Abrir conexão com banco de dados
		
			String url = ("jdbc:sqlite:C:\\Users\\Aluno\\Desktop\\Aula\\ExSQLite\\db\\first_java_database.db");	
			Connection conexao = DriverManager.getConnection(url);
			
			//2. Criar o comando e executar o SQL
			
			Statement comando = conexao.createStatement();
			String querySlect = "SELECT * FROM cliente";
			ResultSet resultado = comando.executeQuery(querySlect);
			
			//3. mostrar os dados
			
			while(resultado.next()) {
			int id = resultado.getInt(1);
			String name = resultado.getString(2);
			String date_nasc = resultado.getString(3);
			String cpf = resultado.getString(4);
			String email = resultado.getString(5);
			
			System.out.println("Id: " + id);
			System.out.println("Nome: " + name);
			System.out.println("Data de Nascimento: " + date_nasc);
			System.out.println("cpf: " + cpf);
			System.out.println("email: " + email);
			System.out.println("-------------------------");
			
			}
 }
 
 public static void incluir() throws SQLException {
		//1. Abrir conexão com banco de dados
		String url = ("jdbc:sqlite:C:\\Users\\Aluno\\Desktop\\Aula\\ExSQLite\\db\\first_java_database.db");	
		Connection conexao = DriverManager.getConnection(url);
		
		
		//2. Criar o comando e executar o SQL		
		Statement comando = conexao.createStatement();
		String queryInsert = "INSERT INTO cliente (name, date_nasc, cpf, email)"
				+ "values ('Ana', 2002/02/13), 554645, alala@alala.com";
		comando.execute(queryInsert);
				
	
 }


public static void atualizar() throws SQLException {
	//1. Abrir conexão com banco de dados
	String url = ("jdbc:sqlite:C:\\Users\\Aluno\\Desktop\\Aula\\ExSQLite\\db\\first_java_database.db");	
	Connection conexao = DriverManager.getConnection(url);
	
	
	//2. Criar o comando e executar o SQL		
	Statement comando = conexao.createStatement();
	String queryUpdate = "update cliente set nome = 'Ana Maria'"
			+ "Where codigo = 2";
	comando.executeUpdate(queryUpdate);	
}


public static void excluir() throws SQLException {
	//1. Abrir conexão com banco de dados
	String url = ("jdbc:sqlite:C:\\Users\\Aluno\\Desktop\\Aula\\ExSQLite\\db\\first_java_database.db");	
	Connection conexao = DriverManager.getConnection(url);
	
	
	//2. Criar o comando e executar o SQL		
	Statement comando = conexao.createStatement();
	String queryUpdate = "DELETE FROM cliente WHERE id = 4";
	comando.executeUpdate(queryUpdate);	
}

}



 

 


