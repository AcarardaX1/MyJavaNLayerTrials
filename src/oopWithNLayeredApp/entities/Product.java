package oopWithNLayeredApp.entities;

public class Product {

	private int id;
	private String name;
	private double nPrice;

	public Product() {}

	public Product(int id, String name, double nPrice) {
		
		this.id = id;
		this.name = name;
		this.nPrice = nPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getnPrice() {
		return nPrice;
	}

	public void setnPrice(double nPrice) {
		this.nPrice = nPrice;
	}

}
