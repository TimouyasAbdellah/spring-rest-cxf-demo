package model;

import java.io.Serializable;
import java.util.Date;

public class Shortcut implements Serializable {

	private static final long	serialVersionUID	= 505467036437317042L;
	private String				name;
	private String				description;
	private ShortcutsTypeEnum	type;
	private ShortcutPlatform	platform;
	private Date				dateCreation;

	public ShortcutPlatform getPlatform() {
		return platform;
	}

	public void setPlatform(ShortcutPlatform platform) {
		this.platform = platform;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ShortcutsTypeEnum getType() {
		return type;
	}

	public void setType(ShortcutsTypeEnum type) {
		this.type = type;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}
