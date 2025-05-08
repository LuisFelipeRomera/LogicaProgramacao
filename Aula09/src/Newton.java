import java.util.Scanner;

public class Newton {
	
	public static void main(String[] args) {
		
		// Variable declaration
		
		Scanner reader = new Scanner(System.in);
		
		double num = 0;
		double est = 0;
		
		// Data input
		
		System.out.print("Enter a number: ");
		num = reader.nextDouble();
		
		reader.close();
		
		// Processing
		
		est = (num / 2);
		for (int i = 0; i < 100; i++) {
			
			System.out.println(est);
			est = ((est) + (num / est)) / 2;
		}
		
		//Data output
		
		System.out.println("Math.sqrt(" + num + ") = " + Math.sqrt(num));
		System.out.println("Newton = " + est);
	}

}
