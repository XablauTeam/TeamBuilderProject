package api.lol.dto;

import api.AbstractProfile;

public class SummonerDTO extends AbstractProfile {

	private int profileIconId;
	private long revisionDate;
	
	
	public SummonerDTO(int profileIconId, long revisionDate, long id, String name, long summonerLevel) {
		super(name, summonerLevel, id);
		this.profileIconId = profileIconId;
		this.revisionDate = revisionDate;
		
	}

	public int getProfileIconId() {
		return profileIconId;
	}

	public void setProfileIconId(int profileIconId) {
		this.profileIconId = profileIconId;
	}

	public long getRevisionDate() {
		return revisionDate;
	}

	public void setRevisionDate(long revisionDate) {
		this.revisionDate = revisionDate;
	}

	@Override
	public String toString() {

		return super.getName();
	}

}
