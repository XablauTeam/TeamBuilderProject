package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public abstract class GenericMBean {

	public String forward(String page){
		return page+"?faces-redirect=true";
	}
	
	
}
