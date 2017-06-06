package business;

import business.exceptions.UsuarioSenhaException;
import model.entities.User;
import model.persistence.service.UserService;

public class LoginBean {
	
	private UserService service = new UserService();
	
	public User login(String login, String password) throws UsuarioSenhaException {
		User user = service.login(login, password);
		if(user != null){
			return user;
		}else{
			throw new UsuarioSenhaException("Usuario ou Senha inválidos");
		}
		
	}

}
