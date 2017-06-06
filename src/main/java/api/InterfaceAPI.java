package api;

import api.exceptions.ConnectionException;

public interface InterfaceAPI {
	public AbstractProfile getSummoner(String summoner, String region) throws ConnectionException;
}