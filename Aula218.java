package application;

import java.io.File;
import java.util.Scanner;

/*
	Manipulating files - File
*/

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Inserts a folder path
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		
		// Filter all directory files 
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// Filter all files
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		// Creates new Directories
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		sc.close();
	}
}