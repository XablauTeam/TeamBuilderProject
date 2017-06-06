package controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import business.LoginBean;
import business.UsuarioSenhaException;
import model.User;

@ManagedBean (name="loginMBean")
@SessionScoped
public class LoginMBean extends GenericMBean{
	
	LoginBean loginBean = new LoginBean();
	
	
	private String login;
	private String senha;
	private User user;
	
	public String login(){
		try {
			setUser(loginBean.login(getLogin(), getSenha()));
			return forward("principal.xhtml");
		} catch (UsuarioSenhaException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(e.getMessage()));
			return "";
		}
	}
	
	public String register(){
		return forward("register.xhtml");
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
