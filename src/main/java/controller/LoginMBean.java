package controller;

import java.util.Iterator;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import business.LoginBean;
import business.exceptions.UsuarioSenhaException;
import model.entities.User;

@ManagedBean(name = "loginMBean")
@SessionScoped
public class LoginMBean extends GenericMBean {

	LoginBean loginBean = new LoginBean();

	private String login;
	private String senha;
	private User user;

	public String login() {
		try {
			this.user = loginBean.login(getLogin(), getSenha()); 
			return forward("principal.xhtml");
		} catch (UsuarioSenhaException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(e.getMessage()));
			return "";
		}
	}

	public boolean validaCampos() {

		FacesContext context = FacesContext.getCurrentInstance();
		Iterator<FacesMessage> it = context.getMessages();
		while (it.hasNext()) {
			it.next();
			it.remove();
		}

		if (login.isEmpty() || senha.isEmpty()) {
			return false;
		}
		return true;
	}

	public String register() {
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
