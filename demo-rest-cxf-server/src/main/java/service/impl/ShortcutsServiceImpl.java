package service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Shortcut;
import query.ShortcutQuery;
import result.ShortcutReults;
import service.ShortcutsService;

public class ShortcutsServiceImpl implements ShortcutsService {

	@Override
	@POST
	@Path("/shortcut")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ShortcutReults getListShortuct(ShortcutQuery query) {
		if (query == null) {
			return null;
		}
		ShortcutReults result = new ShortcutReults();
		List<Shortcut> shortcuts = new ArrayList<>();
		Shortcut shortcut = new Shortcut();
		shortcut.setName("Ctrl+Space");
		shortcut.setDateCreation(new Date());
		shortcut.setDescription("Content Assist");
		shortcuts.add(shortcut);
		result.setShortcuts(shortcuts);
		return result;
	}
}
