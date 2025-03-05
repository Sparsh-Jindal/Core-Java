package endownmentPlan;

public abstract class Endowment {
	protected String endowmentId;
	protected String holderName;
	protected String endowmentType;
	protected String regestrationDate;
	
	public String getEndowmentId() {
		return endowmentId;
	}
	public void setEndowmentId(String endowmentId) {
		this.endowmentId = endowmentId;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getEndowmentType() {
		return endowmentType;
	}
	public void setEndowmentType(String endowmentType) {
		this.endowmentType = endowmentType;
	}
	public String getRegestrationDate() {
		return regestrationDate;
	}
	public void setRegestrationDate(String regestrationDate) {
		this.regestrationDate = regestrationDate;
	}
	
	public Endowment(String endowmentId, String holderName, String endowmentType, String regestrationDate) {
		super();
		this.endowmentId = endowmentId;
		this.holderName = holderName;
		this.endowmentType = endowmentType;
		this.regestrationDate = regestrationDate;
	}
	
	public abstract double calculateEndownment();
}
