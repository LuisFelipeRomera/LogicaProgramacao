package aula06;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		//variable declaration
		
		Scanner reader = new Scanner(System.in);
		
		int a, b, c;
		
		//data input
		System.out.print("input first angle value: ");
		a = reader.nextInt();
		
		System.out.print("input second angle value: ");
		b = reader.nextInt();
		
		System.out.print("input third angle value: ");
		c = reader.nextInt();
		
		reader.close();
		
		//data output
		
		if (a + b + c != 180) {
			
			System.out.print("not a triangle!");
		
		} else if (a == 90 || b == 90 || c == 90) {
			
			System.out.print("rectangle triangle");
			
		} else if (a < 90 && b < 90 && c < 90) {
			
			System.out.print("acutangle triangle");
		
		} else {
			
			System.out.print("obtusangle triangle");
		}
		
		
	}
}
