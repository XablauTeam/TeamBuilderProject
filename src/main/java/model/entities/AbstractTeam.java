package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import business.lol.TeamStatus;

@MappedSuperclass
@PrimaryKeyJoinColumn(name = "id_time")
public abstract class AbstractTeam {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_time")
	private Integer idTime;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status_time")
	private TeamStatus status;

	public AbstractTeam(){
		this.status = TeamStatus.INCOMPLETE;
	}
	
	public Integer getIdTime() {
		return idTime;
	}

	public TeamStatus getStatus() {
		return status;
	}

	public void setStatus(TeamStatus status) {
		this.status = status;
	}
	
}
