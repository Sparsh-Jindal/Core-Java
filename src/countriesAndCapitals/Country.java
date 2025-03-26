package countriesAndCapitals;

import java.util.HashMap;
import java.util.Map;

public class Country {

	private Map<String, String> countryMap;

	public Country() {
		countryMap = new HashMap<>();
	}

	public Map<String, String> getCountryMap() {
		return countryMap;
	}

	public void setCountryMap(Map<String, String> countryMap) {
		this.countryMap = countryMap;
	}

	public void add(String cname, String capname) {
		countryMap.put(cname, capname);
	}

	public String search(String cname) {

		if (countryMap.isEmpty()) {
			return "The map is empty";
		}

		String capital = countryMap.get(cname);

		if (capital == null) {
			return "Data not found";
		}

		return capital;
	}
}
