package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_usuario")
	private Integer idUsuario;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "login", unique = true)
	private String login;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "email")
	private String email;

	public User() {
		super();
	}

	public User(String nome, String login, String senha, String email) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.email = email;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
