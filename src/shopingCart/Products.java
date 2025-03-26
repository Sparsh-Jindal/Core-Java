package shopingCart;

import java.util.Collections;
import java.util.List;

public class Products {
	private List<String>productList;

	public List<String> getProductList() {
		return this.productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}
	public void addProductToList(String s) {
		this.productList.add(s);
	}
	public void sortProductList() {
		Collections.sort(productList);
		for(String  product :productList) {
			System.out.println(product);
		}
	}
	
}
