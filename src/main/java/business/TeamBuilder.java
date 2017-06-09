package business;

import java.util.Collection;

import model.entities.AbstractPlayer;

public interface TeamBuilder {

	public void insertPlayerInTeam(int role, AbstractPlayer player);
	public Collection<?> rolesNeeded();
	public boolean isComplete();
	public void findTeam();
}
