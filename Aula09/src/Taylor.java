import java.util.Scanner;

public class Taylor {
	
	public static void main(String[] args) {
		
		//Variable declaration
		
		Scanner reader = new Scanner(System.in);
		
		double exp = 0;
		double pow = 1;
		double fact = 1;
		double res = 0;
		
		//Data input
		
		System.out.print("Enter the exponent: ");
		
		exp = reader.nextDouble();
		
		reader.close();
		
		//Processing
		
		for (int i = 0; i < 100; i++) {
			
			for (int j = 0; j < i; j++) {
				
				pow *=exp;
			}
			
			for (double j = i; j > 0; j--) {
				
				fact *= j;
			}
			
			res += (pow / fact);
			
			pow = 1;
			fact = 1;
			
		}
		
		//Data output
		
		System.out.println("Math.pow(Math.E, " + exp + ") = " + Math.pow(Math.E, exp));
		
		System.out.println("Taylor = " + res);
	}

}
