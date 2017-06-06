package api.lol;

public enum EApiVersion {
	SUMMONER("/v1.4/"),
	MATCH("/v1.4/"),
	V3("/v3/");
	
   private String version;
	   
	EApiVersion(String version){
		this.version = version;
	}
	
	public String getVersion(){
		return this.version;
	}
}