import java.util.Scanner;

public class DecimalBinary {
	public static void main(String[] args) {
		
		//Variable declaration
		
		Scanner reader = new Scanner(System.in);
		
		int dec = 0;
		int[] bin = new int[1000];
		int quant = 0;
		
		//Data input
		
		System.out.print("Input the decimal number: ");
		dec = reader.nextInt();
		
		reader.close();
		
		//Data processing
		
		do {
			
			bin[quant] = (dec % 2);
			quant++;
			dec = (dec / 2);
			
		} while (dec > 0);
		
		//Data output
		
		for (int i = (quant - 1); i >= 0; i--) {
			
			System.out.print(bin[i]);
		}
	}
}
