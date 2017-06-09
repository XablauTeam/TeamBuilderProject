package api.lol;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import api.exceptions.ConnectionException;
import api.lol.dto.SummonerDTO;

public class SummonerImpl extends GenericAPI {

	public SummonerDTO summonerByName(String[] summoners, String region) throws ConnectionException {

		if (summoners.length > 40) {
			throw new ConnectionException("Não é possivel consultar mais de 40 summoners!");
		}
		if (!containRegion(region.toLowerCase())) {
			throw new ConnectionException("Região inválida!");
		}
		
		try{
			String url = getUrl(region) + EApiVersion.SUMMONER.getVersion() + "summoner/by-name/"
					+ String.join(",", summoners).trim().toLowerCase() + "?api_key=" + getToken();
			
			System.out.println(url);

			Gson gson = new Gson();
			Map<String, SummonerDTO> sum = new HashMap<String, SummonerDTO>();

			sum = gson.fromJson(getConexao().getData(url), new TypeToken<Map<String, SummonerDTO>>() {
			}.getType());
			
			return sum.get(String.join(",", summoners).trim().toLowerCase());
		}catch (Exception e) {
			throw new ConnectionException(e.getMessage());
		}
		
	}

}