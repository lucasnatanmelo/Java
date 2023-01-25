package entities;

import entities.enums.Color;

/*
	abstract class -> Não é permitido instanciar essa classe

*/
public abstract class Shape {

	private Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	// método abstract
	public abstract double area();

	public abstract void insertData(Scanner sc, Color color)();
}
