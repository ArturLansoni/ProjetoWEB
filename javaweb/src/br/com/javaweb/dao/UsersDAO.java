package br.com.javaweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.javaweb.domain.Users;
import br.com.javaweb.factory.ConexaoFactory;

public class UsersDAO {

	public void salvaUser(Users u) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" INSERT INTO users ");
		sql.append(" ( nomeuser, emailuser, senhauser, idadeuser, cpfuser ) ");
		sql.append(" VALUES ( ?, ?, ?, ?, ? ) ");
		Connection conexao = ConexaoFactory.getConexaoMySQL();

		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setString(1, u.getNomeusu());
		comando.setString(2, u.getEmailusu());
		comando.setString(3, u.getSenhausu());
		comando.setInt(4, u.getIdadeusu());
		comando.setString(5, u.getCpfusu());

		comando.executeUpdate();

	}

	public void excluiUser(Users u) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM users ");
		sql.append("WHERE (cpfuser) = ?");

		Connection conexao = ConexaoFactory.getConexaoMySQL();

		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setString(1, u.getCpfusu());
		comando.executeUpdate();

	}

	public void editaUser(Users u) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE users ");
		sql.append(" SET nomeuser = ? , emailuser = ? , senhauser = ? ");
		sql.append(" WHERE cpfuser = ? ");
		Connection conexao = ConexaoFactory.getConexaoMySQL();
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setString(1, u.getNomeusu());
		comando.setString(2, u.getEmailusu());
		comando.setString(3, u.getSenhausu());
		comando.setString(4, u.getCpfusu());

		comando.executeUpdate();

	}

	

	public ArrayList<Users> listar() throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT nomeuser, emailuser, idadeuser, cpfuser ");
		sql.append(" FROM users ");
		sql.append(" ORDER BY nomeuser ASC ");
		Connection conexao = ConexaoFactory.getConexaoMySQL();
		PreparedStatement comando = conexao.prepareStatement(sql.toString());

		ResultSet resultado = comando.executeQuery();

		ArrayList<Users> lista = new ArrayList<Users>();
		while (resultado.next()) {
			Users u = new Users();
			
			u.setNomeusu(resultado.getString("nomeuser"));
			u.setEmailusu(resultado.getString("emailuser"));
			u.setIdadeusu(resultado.getInt("idadeuser"));
			u.setCpfusu(resultado.getString("cpfuser"));

			lista.add(u);
		}
		return lista;
	}	

	
	
}
