package pl.opole.uni.springWebApp.models;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Races {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long RaceId;
	private String RaceName;
	private String RaceDescryption;
	
	@OneToMany(mappedBy = "Playerid")
	private List<Players> PlayersList;

	public Long getRaceId() {
		return RaceId;
	}
	public void setRaceId(Long raceId) {
		RaceId = raceId;
	}
	public String getRaceName() {
		return RaceName;
	}
	public void setRaceName(String raceName) {
		RaceName = raceName;
	}
	public String getRaceDescryption() {
		return RaceDescryption;
	}
	public void setRaceDescryption(String raceDescryption) {
		RaceDescryption = raceDescryption;
	}
	public List<Players> getPlayersList() {
		return PlayersList;
	}
	public void setPlayersList(List<Players> playersList) {
		PlayersList = playersList;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(RaceId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Races other = (Races) obj;
		return Objects.equals(RaceId, other.RaceId);
	}
	
}
