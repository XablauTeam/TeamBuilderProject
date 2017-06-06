package business;

import model.User;

public class LoginBean {

	public User login(String login, String senha) throws UsuarioSenhaException {
		if(login.equals("jose") && senha.equals("123")){
			return new User("José Tester", login, senha, "jose@bol.com.br");
		}else{
			throw new UsuarioSenhaException("Usuario ou Senha inválidos");
		}
		
	}

}
