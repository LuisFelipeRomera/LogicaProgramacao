import java.util.Scanner;

public class Parity {
	public static void main(String[] args) {
		//variable declaration
		
		Scanner reader = new Scanner(System.in);
		int num = 0;
		
		//data input
		System.out.print("Input an integer number: ");
		num = reader.nextInt();
		
		reader.close();
		
		//data output
		if (num == 0) {
			System.out.println("Zero!");
		} else {
			if ((num % 2) == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
			
			if (num > 0) {
				System.out.println("Positive");
			} else {
				System.out.println("Negative");
			}
		}
	}
}
