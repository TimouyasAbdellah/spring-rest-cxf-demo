package result;

import java.util.List;

import model.Shortcut;

public class ShortcutReults {

	private String			status;
	private String			raison;
	private List<Shortcut>	shortcuts;

	public List<Shortcut> getShortcuts() {
		return shortcuts;
	}

	public void setShortcuts(List<Shortcut> shortcuts) {
		this.shortcuts = shortcuts;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRaison() {
		return raison;
	}

	public void setRaison(String raison) {
		this.raison = raison;
	}
}
