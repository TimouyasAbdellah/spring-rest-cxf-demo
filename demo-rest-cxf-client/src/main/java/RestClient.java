import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.ShortcutPlatform;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import query.ShortcutQuery;
import result.ShortcutReults;

public class RestClient {

	private static final String	REST_URL		= "http://localhost:8080/demo-rest-cxf-server/ws/shortcutService/shortcut";
	RestTemplate				restTemplate	= new RestTemplate();

	public static void main(String[] args) {
		RestClient restClient = new RestClient();
		restClient.getListFund();
	}

	public void getListFund() {
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
		messageConverters.add(new GsonHttpMessageConverter(true));
		restTemplate.setMessageConverters(messageConverters);
		ShortcutQuery query = new ShortcutQuery();
		query.setDateCreation(new Date());
		query.setPlatform(ShortcutPlatform.ECLIPSE);
		ShortcutReults postForObject = restTemplate.postForObject(REST_URL, query, ShortcutReults.class);
		System.out.println(postForObject.getShortcuts().get(0).getName());
	}
}
