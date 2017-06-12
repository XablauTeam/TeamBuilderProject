package business;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import business.exceptions.CannotInsertException;
import business.lol.LolTeamProcessor;
import model.entities.AbstractPlayer;
import model.entities.AbstractTeam;
import model.entities.LolPlayer;
import model.entities.LolTeam;
import model.persistence.service.LolTeamService;

@Stateless
public class TeamBean implements TeamBuilder{
	
	@EJB
	private LolTeamService lolTeamService;
	
	private LolTeamProcessor lolTeamProcessor;
	
	@Override
	public AbstractTeam findTeam(AbstractPlayer player) {
		ArrayList<LolTeam> teamList = (ArrayList<LolTeam>) lolTeamService.findIncompleteTeams();
		if (!teamList.isEmpty()){
			for(LolTeam teamAnalyzed : teamList){
				if(lolTeamProcessor.isRoleNeeded(teamAnalyzed, player)){
					return teamAnalyzed;
				}
			}
		}
		
		return null;
	}

	@Override
	public AbstractTeam createNewTeam(AbstractPlayer player) {
		LolTeam lolTeam = new LolTeam();
		lolTeamService.insert(lolTeam);
		return lolTeam;
	}

	@Override
	public void insertPlayerInTeam(AbstractPlayer player, AbstractTeam team) throws CannotInsertException {
		lolTeamProcessor.insertPlayerInTeam(player, team);
		player.setTeamID(team.getIdTime());
		lolTeamService.update((LolTeam)team);
	}

	@Override
	public boolean playerHasTeam(AbstractPlayer player) {
		return player.getTeamID() != 0;
	}

	@Override
	public boolean removePlayerFromTeam(AbstractPlayer player) {
		LolTeam team;
		if(player.getTeamID() != 0){
			team = lolTeamService.findById(player.getTeamID());
			lolTeamProcessor.removePlayer(player, team);
			lolTeamService.update(team);
			return true;
		}
		return false;
	}
	
	
	
	
}
