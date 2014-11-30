package service;

import javax.jws.WebService;

import query.ShortcutQuery;
import result.ShortcutReults;

@WebService(serviceName = "shortcutService")
public interface ShortcutsService {

	ShortcutReults getListShortuct(ShortcutQuery query);
}
