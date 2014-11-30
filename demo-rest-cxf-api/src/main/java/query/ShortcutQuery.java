package query;

import java.util.Date;

import model.ShortcutPlatform;
import model.ShortcutsTypeEnum;

public class ShortcutQuery {

	private ShortcutPlatform	platform;
	private ShortcutsTypeEnum	type;
	private Date				dateCreation;

	public ShortcutPlatform getPlatform() {
		return platform;
	}

	public void setPlatform(ShortcutPlatform platform) {
		this.platform = platform;
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
