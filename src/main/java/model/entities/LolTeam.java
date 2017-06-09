package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LOLTEAM")
public class LolTeam extends AbstractTeam {
	
	@Column(name = "top")
	private LolPlayer top;
	
	@Column(name = "jungler")
	private LolPlayer jungler;
	
	@Column(name = "mid")
	private LolPlayer mid;
	
	@Column(name = "support")
	private LolPlayer support;
	
	@Column(name = "bottom")
	private LolPlayer bottom;
	
	public LolTeam(){
		super();
	}

	public LolPlayer getTop() {
		return top;
	}

	public void setTop(LolPlayer top) {
		this.top = top;
	}

	public LolPlayer getJungler() {
		return jungler;
	}

	public void setJungler(LolPlayer jungler) {
		this.jungler = jungler;
	}

	public LolPlayer getMid() {
		return mid;
	}

	public void setMid(LolPlayer mid) {
		this.mid = mid;
	}

	public LolPlayer getSupport() {
		return support;
	}

	public void setSupport(LolPlayer support) {
		this.support = support;
	}

	public LolPlayer getBottom() {
		return bottom;
	}

	public void setBottom(LolPlayer bottom) {
		this.bottom = bottom;
	}
}
