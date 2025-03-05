package vivekFurniture;

public class WoodenBero extends Bero {
	
	private String woodType;

	public String getWoodType() {
		return woodType;
	}
	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}
	
	WoodenBero(String beroType,String beroColour,String woodType){
		
		super(beroType,beroColour);
		this.woodType=woodType;
	}
	
	public void calculatePrice() {
		switch(woodType) {
		
			case "Ply Wood" :price=1500;
			break;
			case "Teak Wood":price=1200;
			break;
			case "Engineered Wood":price=10000;
			break;
			default:price=0;
		}
	}
	
}
