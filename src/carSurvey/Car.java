package carSurvey;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Car {

	private Map<String, Integer> carMap;

	public Car() {
		setCarMap(new TreeMap<>());
	}

	public Map<String, Integer> getCarMap() {
		return carMap;
	}

	public void setCarMap(Map<String, Integer> carMap) {
		this.carMap = carMap;
	}
	
//To put in the TreeMap
	public void addCar(String name, int num) {
		if (num > 0) {
			carMap.put(name, num);
		}

	}

//To search the sold by name
	public int carByName(String name) {
		if (carMap.containsKey(name)) {
			int sold = carMap.get(name);
			return sold;
		}
		return 0;

	}

//To search name of the cars by there sold count
	public List<String> carByCount(int count) {

		List<String> ls = new ArrayList<String>();

		
//		  for (Map.Entry<String, Integer> entry : carMap.entrySet()) {
//		  
//		  if (entry.getValue() >= count) { ls.add(entry.getKey()); } }
		 

		carMap.forEach((name, sold) -> {
			if (sold >= count) {
				ls.add(name);
			}
		});

		return ls;

	}
	
//To return total number of cars sold
	public int totalCarsSold() {
		int sum = 0;
		for (Integer val : carMap.values()) {
			sum += val;
		}
		return sum;
	}
	
//To chech if the TreeMap is empty or not
	public boolean toCheck() {
		if(carMap.isEmpty()) {
			return true;
		}
		return false;
	}

}
