import java.util.Scanner;

public class sum2minor {
	public static void main(String[] args) {
		//variable declaration
		double num1, num2, num3, num1num2, num1num3, num2num3;
		Scanner reader = new Scanner(System.in);
		
		//data input
		System.out.print("input first number: ");
		num1 = reader.nextDouble();
		
		System.out.print("input second number: ");
		num2 = reader.nextDouble();
		
		System.out.print("input third number: ");
		num3 = reader.nextDouble();
		
		reader.close();
		
		//data processing
		
		num1num2 = num1 + num2;
		
		num1num3 = num1 + num3;
		
		num2num3 = num3 + num2;
		
		//data output
		
		if ((num1num2 < num1num3) && (num1num2 < num2num3)) {
			System.out.println(num1num2);
		} else {
			if ((num1num3 < num1num3) && (num1num3 <num2num3)) {
				System.out.println(num1num3);
			} else {
				System.out.println(num2num3);
			}
		}
	}
}
