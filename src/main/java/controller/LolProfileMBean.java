package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.entities.User;

@ManagedBean(name = "lolProfileMBean")
@SessionScoped
public class LolProfileMBean extends GenericMBean{
	
	@ManagedProperty("#{loginMBean.user}")
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
