package endownmentPlan;

public class EducationalEndowmnet extends Endowment {

	private String educationalInstituion;
	private String educationalDivison;

	public String getEducationalInstituion() {
		return educationalInstituion;
	}

	public void setEducationalInstituion(String educationalInstituion) {
		this.educationalInstituion = educationalInstituion;
	}

	public String getEducationalDivison() {
		return educationalDivison;
	}

	public void setEducationalDivison(String educationalDivison) {
		this.educationalDivison = educationalDivison;
	}

	public EducationalEndowmnet(String endowmentId, String holderName, String endowmentType, String regestrationDate,
			String educationalInstituion, String educationalDivison) {
		super(endowmentId, holderName, endowmentType, regestrationDate);
		this.educationalInstituion = educationalInstituion;
		this.educationalDivison = educationalDivison;
	}

	public double calculateEndownment() {
		if(educationalDivison.equals("School")) {
			return 30000;
		}
		else if(educationalDivison.equals("UnderGrdaduate")) {
			return 60000;
		}
		else if(educationalDivison.equals("PostGraduate")) {
			return 90000;
		}
		return 0.0;
	}
}
