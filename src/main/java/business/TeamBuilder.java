package business;

import javax.ejb.Local;

import business.exceptions.CannotInsertException;
import model.entities.AbstractPlayer;
import model.entities.AbstractTeam;

@Local
public interface TeamBuilder {

	public AbstractTeam findTeam(AbstractPlayer player);
	public AbstractTeam createNewTeam(AbstractPlayer player);
	public void insertPlayerInTeam(AbstractPlayer player, AbstractTeam team) throws CannotInsertException;
	public boolean playerHasTeam(AbstractPlayer player); 
	public boolean removePlayerFromTeam(AbstractPlayer player);
}
