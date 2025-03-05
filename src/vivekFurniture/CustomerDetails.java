package vivekFurniture;

public class CustomerDetails {
	
	private String customerName;
	private long phoneNumber;
	private String address;
	
	//SETTER METHOD
	public void setCustomerName(String costumerName) {
		this.customerName=costumerName;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	//GETTER METHOD
	public String getCustomerName() {
		return this.customerName;
	}
	public long getPhoneNumber() {
		return this.phoneNumber;
	}
	public String getAddress() {
		return this.address;
	}
	
	
	CustomerDetails (String customerName,long phoneNumber,String address){
		this.customerName=customerName;
		this.phoneNumber=phoneNumber;
		this.address=address;
	}
	

	
}
