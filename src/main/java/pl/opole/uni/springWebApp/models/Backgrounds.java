package pl.opole.uni.springWebApp.models;

import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Backgrounds {//add stats adding system

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long BackgroundId;
	private String BackgroundName;
	private String BackgroundDescryption;
	public Long getBackgroundId() {
		return BackgroundId;
	}
	public void setBackgroundId(Long backgroundId) {
		BackgroundId = backgroundId;
	}
	public String getBackgroundName() {
		return BackgroundName;
	}
	public void setBackgroundName(String backgroundName) {
		BackgroundName = backgroundName;
	}
	public String getBackgroundDescryption() {
		return BackgroundDescryption;
	}
	public void setBackgroundDescryption(String backgroundDescryption) {
		BackgroundDescryption = backgroundDescryption;
	}
	@Override
	public int hashCode() {
		return Objects.hash(BackgroundId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Backgrounds other = (Backgrounds) obj;
		return Objects.equals(BackgroundId, other.BackgroundId);
	}
}
