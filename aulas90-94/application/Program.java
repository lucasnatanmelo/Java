package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent; // Auto-import CTRL+SHIFT+O

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Creates an array with 10 positions with Rent type
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		// Insert users in array
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();

			System.out.print("Room: ");
			int roomNumber = sc.nextInt();

			if(vect[roomNumber] != null) {
				System.out.println("This room is already rented " + vect[roomNumber]);
				i--;
			} else {
				vect[roomNumber] = new Rent(name, email);
			}
		}
		
		for(int i = 1; i <= vect.length - 1 ; i++) {
			System.out.println(vect[i] != null ? (i + " : " + vect[i]) : (i + " room is not busy"));   
		}
		sc.close();
	}

}
