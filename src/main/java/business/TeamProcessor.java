package business;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import business.exceptions.CannotInsertException;
import model.entities.AbstractPlayer;
import model.entities.AbstractTeam;

public interface TeamProcessor {
	
	public void insertPlayerInTeam(AbstractPlayer player, AbstractTeam team) throws CannotInsertException;
	
	public void removePlayer(AbstractPlayer player, AbstractTeam team);
	
	public boolean isComplete(AbstractTeam team);

	boolean isRoleNeeded(AbstractTeam team, AbstractPlayer player);
}
