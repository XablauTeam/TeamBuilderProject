package model.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="lolteam")
public class LolTeam extends AbstractTeam {
	
	@OneToOne
	@JoinColumn(name = "top")
	private LolPlayer top;
	
	@OneToOne
	@JoinColumn(name = "jungler")
	private LolPlayer jungler;
	
	@OneToOne
	@JoinColumn(name = "mid")
	private LolPlayer mid;
	
	@OneToOne
	@JoinColumn(name = "support")
	private LolPlayer support;
	
	@OneToOne
	@JoinColumn(name = "bottom")
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