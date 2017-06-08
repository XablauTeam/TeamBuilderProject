package model.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;

import business.PlayerStatus;


@MappedSuperclass
@PrimaryKeyJoinColumn(name = "id_usuario")
public abstract class AbstractPlayer extends User {
	
	@Column(name = "playerName")
	private String playerName;
	@Column(name = "playerId")
	private long playerId;
	@Column(name = "playerLevel")
	private long playerLevel;
	
	@Column(name = "playerStatus")
	@Enumerated(EnumType.STRING)
	private PlayerStatus status;
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}

	public long getPlayerLevel() {
		return playerLevel;
	}

	public void setPlayerLevel(long playerLevel) {
		this.playerLevel = playerLevel;
	}

	public PlayerStatus getStatus() {
		return status;
	}

	public void setStatus(PlayerStatus status) {
		this.status = status;
	}
	
	
	
}
