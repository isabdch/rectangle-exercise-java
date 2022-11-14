package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter the rectangle width and height:");
		
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		rectangle.area();
		rectangle.perimeter();
		rectangle.diagonal();
		
		System.out.println(rectangle);
		
		sc.close();
	}

}
