package pl.opole.uni.springWebApp.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items { //Add many to many relation with player

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ItemId;
	private String ItemName;
	private String ItemDescryption;
	private String ItemType;
	
	public Long getItemId() {
		return ItemId;
	}
	public void setItemId(Long itemId) {
		ItemId = itemId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public String getItemDescryption() {
		return ItemDescryption;
	}
	public void setItemDescryption(String itemDescryption) {
		ItemDescryption = itemDescryption;
	}
	public String getItemType() {
		return ItemType;
	}
	public void setItemType(String itemType) {
		ItemType = itemType;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ItemId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		return Objects.equals(ItemId, other.ItemId);
	}
}
