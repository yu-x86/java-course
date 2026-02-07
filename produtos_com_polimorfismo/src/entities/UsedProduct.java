package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{
	private Date manufactureDate;
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	@Override
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + " (used) $" + String.format("%.2f", getPrice()) + " (Manufacture date: " + sdf1.format(getManufactureDate()) + ")\n");	
		return sb.toString();
	}
	
	
}
