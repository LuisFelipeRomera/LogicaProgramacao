import java.util.Scanner;

public class BarArray {
	public static void main(String[] args) {
		
		//variable declaration
		
		Scanner reader = new Scanner(System.in);
		
		double[] table = new double[100];
		int code = 0;
		double val = 0;
		
		//data input
		
		do {
			System.out.print("Input the code: ");
			code = reader.nextInt();
			
			System.out.print("Input the value: ");
			val = reader.nextDouble();
			
			table[code] = val;
			
			System.out.print("Type <1> if there are more values: ");
		} while (reader.nextInt() == 1);
		
		reader.close();
		
		//data output
		
		System.out.println("code\tvalue");
		
		for (int i = 0; i < table.length; i++) {
			
			if (table[i] > 0) {
				
				System.out.println(i + "\t" + table[i]);
			}
		}
	}
}
