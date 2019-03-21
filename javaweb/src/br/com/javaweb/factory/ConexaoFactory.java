package br.com.javaweb.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static String status = "Não conectou...";

	public ConexaoFactory() {
	}

	public static java.sql.Connection getConexaoMySQL() {

		Connection connection = null;
		try {
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);			
			String url = "jdbc:mysql://localhost:3306/projetoweb?useTimezone=true&serverTimezone=UTC";
			String username = "root";
			String password = "";
			connection = DriverManager.getConnection(url, username, password);

			if (connection != null) {
				status = ("STATUS--->Conectado com sucesso!");
			} else {
				status = ("STATUS--->Não foi possivel realizar conexão");
			}
			return connection;
		} catch (ClassNotFoundException e) {
			System.out.println("O driver expecificado nao foi encontrado.");
			return null;
		} catch (SQLException e) {
			System.out.println("Nao foi possivel conectar ao Banco de Dados.");
			return null;
		}
	}

	public static String statusConection() {
		return status;
	}

	public static boolean FecharConexao() {
		try {
			ConexaoFactory.getConexaoMySQL().close();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public static java.sql.Connection ReiniciarConexao() {
		FecharConexao();
		return ConexaoFactory.getConexaoMySQL();
	}
}