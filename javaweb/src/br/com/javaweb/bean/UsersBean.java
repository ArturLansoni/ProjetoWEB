package br.com.javaweb.bean;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.javaweb.dao.UsersDAO;
import br.com.javaweb.domain.Users;
import br.com.javaweb.util.JSFUtil;

@ManagedBean(name = "MBUsers")
@ViewScoped
public class UsersBean {
	
	private Users users;
	private ArrayList<Users> itens;
	private ArrayList<Users> itensFiltrados;	

	public ArrayList<Users> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Users> itens) {
		this.itens = itens;
	}

	public ArrayList<Users> getItensFiltrados() {
		return itensFiltrados;
	}

	public void setItensFiltrados(ArrayList<Users> itensFiltrados) {
		this.itensFiltrados = itensFiltrados;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@PostConstruct
	public void preparaPesquisa() {
		try {
			UsersDAO udao = new UsersDAO();
			itens = udao.listar();
		} catch (SQLException e) {
			JSFUtil.adicMesgErro(e.getMessage());
			e.printStackTrace();
		}
	}

	public void preparanovo() {
		users = new Users();
	}

	public void novouser() {

		try {
			UsersDAO udao = new UsersDAO();
			udao.salvaUser(users);
			itens = udao.listar();
			JSFUtil.adicMsgSucesso(" Usuario salvo com sucesso! ");
		} catch (Exception e) {
			e.printStackTrace();
			JSFUtil.adicMesgErro(e.getMessage());
		}

	}

	public void apagar() {
		try {
			UsersDAO udao = new UsersDAO();
			udao.excluiUser(users);
			itens = udao.listar();
			JSFUtil.adicMsgSucesso("Usuario removido com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
			JSFUtil.adicMesgErro(e.getMessage());
		}
	}

	public void editar() {
		try {
			UsersDAO udao = new UsersDAO();
			udao.editaUser(users);
			itens = udao.listar();
			JSFUtil.adicMsgSucesso("Usuario editado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
			JSFUtil.adicMesgErro(e.getMessage());
		}
	}
}
