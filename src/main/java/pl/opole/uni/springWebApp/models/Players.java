package pl.opole.uni.springWebApp.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Players {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Playerid;
	private String PlayerName;
	
	@ManyToOne
	@JoinColumn(name = "RaceId")
	private Races Race;
	
	@Override
	public int hashCode() {
		return Objects.hash(Playerid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Players other = (Players) obj;
		return Objects.equals(Playerid, other.Playerid);
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public Races getRace() {
		return Race;
	}

	public void setRace(Races race) {
		Race = race;
	}

	public Long getId() {
		return Playerid;
	}

	public void setId(Long playerid) {
		this.Playerid = playerid;
	}

	//@Transient   Nie chciane pole
	
}
