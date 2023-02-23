package application;

import java.util.Scanner;

/**
	Matrix lesson
 */

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// Lines quantity
		System.out.println("Insert number of lines: ");
		int m = sc.nextInt();
		
		System.out.println("Insert number of columns: ");
		// Columns quantity
		int n = sc.nextInt();
		
		// Initialize the matrix
		int[][] mat = new int[m][n];
		
		// Insertion of numbers in matrix
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.println("Insert a integer number in position " + i + "," + j + ":");
				mat[i][j] = sc.nextInt();
			}
		}
		
		// User insert the element wanted to find
		System.out.println("Insert your wanted number: ");
		int x = sc.nextInt();
		
		boolean containsTheNumber = false;
		
		// Loop through matrix
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				// Finds the element
				if (mat[i][j] == x) {
					containsTheNumber = true;
					System.out.println("Number found at position (" + i + "," + j + "):");
					// In case the elements exists,
					// Return the left element
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					// Return the up element
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					// Return the right element
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					// Return the down element
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				} 
			}
		}
		
		if(!containsTheNumber) {System.out.println("The matrix does not contains your wanted number!");}
		
		sc.close();
	}
}