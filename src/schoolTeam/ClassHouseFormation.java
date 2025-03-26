package schoolTeam;

import java.util.HashSet;

public class ClassHouseFormation {

	private HashSet<String> studSet;

	public ClassHouseFormation() {
		studSet = new HashSet<String>();
	}

	public HashSet<String> getStudSet() {
		return studSet;
	}

	public void setStudSet(HashSet<String> studSet) {
		this.studSet = studSet;
	}

	public void addName(String details) {
		String[] name = details.split(":");
		if (name.length == 2) {
			String Fname = name[1].trim();
			studSet.add(Fname);
		}
	}

//	public void display() {
//		System.out.println(studSet);
//	}

	public HashSet<String> formTeam() {
		HashSet<String> teamSet = new HashSet<>();
		
		for (String name : studSet) {
		
			char demo=name.charAt(0);
			char firstChar=Character.toUpperCase(demo);
			String house = "";
			if (firstChar >= 'A' && firstChar <= 'H') {
				house = "RED";
			} else if (firstChar >= 'I' && firstChar <= 'P') {
				house = "BLUE";
			} else if (firstChar >= 'Q' && firstChar <= 'Z') {
				house = "GREEN";
			}
			teamSet.add(name + ":" + house);
		}
		return teamSet;

	}
}
