package api.lol;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GenericAPI {

	private static String token = "b1b9de11-bf45-4ee0-851a-aa31f0a1b7c2";

	private ConnectorAPI conexao = new ConnectorAPI();

	public ConnectorAPI getConexao() {
		return conexao;
	}

	private static Map<String, String> mapRegionLocation;

	static {
		mapRegionLocation = new HashMap<String, String>();
		mapRegionLocation.put("br", "br1");
		mapRegionLocation.put("eune", "eune1");
		mapRegionLocation.put("euw", "euw1");
		mapRegionLocation.put("jp", "jp1");
		mapRegionLocation.put("kr", "kr");
		mapRegionLocation.put("lan", "la1");
		mapRegionLocation.put("las", "la2");
		mapRegionLocation.put("na", "na1");
		mapRegionLocation.put("oce", "oce1");
		// mapRegionLocation.put("pbe", "br1");
		mapRegionLocation.put("ru", "ru");
		mapRegionLocation.put("tr", "tr1");
	}

	public static String getToken() {
		return token;
	}

	public static String getUrl(String region) {
		return "https://"+region+".api.riotgames.com/api/lol/"+region;
	}

	public boolean containRegion(String region) {
		return mapRegionLocation.containsKey(region);
	}

	public String getLocation(String region) {
		if (containRegion(region)) {
			return mapRegionLocation.get(region);
		}

		return "";
	}

	public static Collection<String> getAllLocations() {
		return mapRegionLocation.keySet();
	}

}
