package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import business.PlayerBean;
import business.PlayerStatus;
import business.exceptions.BusinessException;
import business.lol.LolRegioes;
import business.lol.LolRole;
import model.entities.LolPlayer;
import model.entities.User;

@ManagedBean(name = "lolProfileMBean")
@SessionScoped
public class LolProfileMBean extends GenericMBean {

	@ManagedProperty("#{loginMBean.user}")
	private User user;

	private PlayerStatus playerStatus;

	private LolPlayer player;

	@EJB
	PlayerBean playerBean;

	@PostConstruct
	public void onLoad() {
		try {
			player = playerBean.findById(user.getIdUsuario());
		} catch (BusinessException e) {
			player = new LolPlayer();
		}
	}

	public String cadastrarPlayer() {
		try {
			player.setStatus(PlayerStatus.SEARCHING_TEAM);
			playerBean.incluirPlayer(user, player);
			user.setPlayer(player);
		} catch (Exception e) {
			incluirErro(e.getMessage());
		}
		return "";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LolPlayer getPlayer() {
		return player;
	}

	public void setPlayer(LolPlayer player) {
		this.player = player;
	}

	public List<PlayerStatus> getPlayerStatus() {
		List<PlayerStatus> itens = new ArrayList<PlayerStatus>();
		for (PlayerStatus stat : PlayerStatus.values()) {
			itens.add(stat);
		}
		return itens;
	}
	
	public List<LolRole> getRoles() {
		List<LolRole> itens = new ArrayList<LolRole>();
		for (LolRole role : LolRole.values()) {
			itens.add(role);
		}
		return itens;
	}
	
	public List<LolRegioes> getRegioes() {
		List<LolRegioes> itens = new ArrayList<LolRegioes>();
		for (LolRegioes regiao : LolRegioes.values()) {
			itens.add(regiao);
		}
		return itens;
	}

}
