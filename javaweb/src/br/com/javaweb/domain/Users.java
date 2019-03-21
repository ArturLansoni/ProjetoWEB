package br.com.javaweb.domain;

public class Users {
	private Integer idusu;
	private String nomeusu;
	private String emailusu;
	private String senhausu;
	private Integer idadeusu;
	private String cpfusu;

	public Integer getIdusu() {
		return idusu;
	}

	public void setIdusu(Integer idusu) {
		this.idusu = idusu;
	}

	public String getNomeusu() {
		return nomeusu;
	}

	public void setNomeusu(String nomeusu) {
		this.nomeusu = nomeusu;
	}

	public String getEmailusu() {
		return emailusu;
	}

	public void setEmailusu(String emailusu) {
		this.emailusu = emailusu;
	}

	public String getSenhausu() {
		return senhausu;
	}

	public void setSenhausu(String senhausu) {
		this.senhausu = senhausu;
	}

	public Integer getIdadeusu() {
		return idadeusu;
	}

	public void setIdadeusu(Integer idadeusu) {
		this.idadeusu = idadeusu;
	}

	public String getCpfusu() {		
		return cpfusu;
	}

	public void setCpfusu(String cpfusu) {
		this.cpfusu = cpfusu;
	}
	
	public Users() { }
	
	@Override
	public String toString() {
		String saida = nomeusu + " - " + emailusu + " - " + idadeusu + " - " + cpfusu;
		return saida;
	}

}
