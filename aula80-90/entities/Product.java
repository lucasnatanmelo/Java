package entities;

/*

Para criar o construtor automático, getters e setters -> botao direito -> source:
	- Generate constructor using Fields
	- Generate Getters e Setters

*/
public class Product {
	
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
