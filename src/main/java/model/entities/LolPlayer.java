package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LOLPLAYER")
public class LolPlayer extends AbstractPlayer {
	
	@Column(name = "lolPosicao")
	private int lolPosicao;

	public int getLolPosicao() {
		return lolPosicao;
	}

	public void setLolPosicao(int lolPosicao) {
		this.lolPosicao = lolPosicao;
	}
	
	

}
