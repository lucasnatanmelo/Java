package entities;

/*

Para criar o construtor automático, getters e setters -> botao direito -> source:
	- Generate constructor using Fields
	- Generate Getters e Setters

*/
public class Rent {
	private String name;
	private String email;
	
	public Rent(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return name + ", " + email;
	}
	
}
