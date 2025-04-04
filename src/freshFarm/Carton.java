package freshFarm;
import java.util.*;
import java.util.stream.*;
public class Carton {
	private String productName;
    private int quantity;
    private double productCost;

    public Carton(String productName, int quantity, double productCost) {
        this.productName = productName;
        this.quantity = quantity;
        this.productCost = productCost;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getProductCost() {
        return productCost;
    }
	}

