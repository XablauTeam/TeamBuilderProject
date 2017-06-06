package api;

import api.exceptions.ConnectionException;
import api.lol.SummonerImpl;

public class FacadeAPI implements InterfaceAPI {
	
	private SummonerImpl summonerProfile;
	
	public FacadeAPI(){
		summonerProfile = new SummonerImpl();
	}
	
	public AbstractProfile getSummoner(String summoner, String region) throws ConnectionException{
		return summonerProfile.summonerByName(new String[]{summoner}, region);
	}
	
}