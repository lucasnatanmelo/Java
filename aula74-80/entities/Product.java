package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	// Construtor padrâo - Não recebe parâmetros
	public Product() {
		// Caso precise, inicilizar valores
		// In this case, it starts as null
	}

	// Construtor da classe - Todos os argumantos
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Construtor da classe - Sobrecarga - X quantity
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Methods:

	// Name
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Price
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Quantity
	public int getQuantity() {
		return this.quantity;
	}

	// Common Methods
	public double totalValueInStock() {
		return this.price * this.quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// toString() é método padrão dos objetos do Java - Nessa situação, o método é
	// sobrescrito
	public String toString() {
		return this.name + ", $" + String.format("%.2f", this.price) + ", " + this.quantity + " units, Total: $ "
				+ String.format("%.2f", this.totalValueInStock());
	}
}
