import java.util.Scanner;

public class BinaryDecimal {

		public static void main(String[] args) {
			
			//Variable declaration
			
			Scanner reader = new Scanner(System.in);
			String binary = "";
			int decimal = 0;
			
			//Data input
			System.out.print("Input a binary number: ");
			binary = reader.next();
			
			reader.close();
			
			//Data processing
			
			for (int i = 0; i < binary.length(); i++) {
				
				decimal += (Integer.parseInt(binary.substring(i, i + 1)) *
							Math.pow(2, binary.length() - 1 - i));
			}
			
			//Data output
			
			System.out.println("Decimal: " + decimal);
		}
}
