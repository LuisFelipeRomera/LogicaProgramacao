package aula06;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		
		//variable declaration
		
		Scanner reader = new Scanner(System.in);
		
		double a = 0, b = 0, c = 0, delta = 0, x1 = 0, x2 = 0;
		
		//data input
		
		System.out.print("type a value: ");
		a = reader.nextDouble();
		
		System.out.print("type b value: ");
		b = reader.nextDouble();
		
		System.out.print("type c value: ");
		c = reader.nextDouble();
		
		reader.close();
		
		//data processing
		
		delta = Math.pow(b, 2) - 4 * a * c;
		
		if (delta >= 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
		}
		
		//data output
		
		if (delta > 0) {
			
			System.out.print("x1 = " + x1 + " and x2 = " + x2);
			
		} else if (delta == 0) {
			
			System.out.print("x1 = x2 = " + x1);
			
		} else {
			
			System.out.print("there isn't any real solution to the equation");
		}
	}
}
