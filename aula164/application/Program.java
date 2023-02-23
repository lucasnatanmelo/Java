package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.Rectangle;
import entities.Circle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		// Default entry settings
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// List of shapes
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		// Loop through list
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());

			// chat GPT
			if (ch == 'r') {
				Rectangle rectangle = new Rectangle();
				rectangle.insertData(sc, color);
				list.add(rectangle);
			} else {
					Circle circle = new Circle();
					circle.insertData(sc, color);
					list.add(circle);
			}
		}
		
		// Print areas
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}
}
