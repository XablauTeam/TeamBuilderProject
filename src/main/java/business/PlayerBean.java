package business;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import business.exceptions.BusinessException;
import model.entities.LolPlayer;
import model.entities.User;
import model.persistence.service.LolPlayerService;

@Stateless
public class PlayerBean {
	
	@EJB
	private LolPlayerService lolPlayerService;

	public LolPlayer findById(Integer id) throws BusinessException {
		LolPlayer ab = lolPlayerService.findById(id);
		if (ab != null)
			return ab;
		else
			throw new BusinessException("Player não encotrado.");
	}

	public void incluirPlayer(User user, LolPlayer lolPlayer) throws Exception {
		lolPlayer.setIdUsuario(user.getIdUsuario());
		
		lolPlayerService.insert(lolPlayer);

	}

}
