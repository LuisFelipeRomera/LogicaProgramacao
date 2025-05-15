import java.util.Scanner;

public class FilterArray {
	public static void main(String[] args) {
		
		//variable declaration
		
		Scanner reader = new Scanner(System.in);
		
		int[] origArray = new int[10];
		int[] bigArray = new int[10];
		
		int lim = 0;
		int quant = 0;
		
		//data input
		
		for (int i = 0; i < origArray.length; i++) {
			
			System.out.print("Input the position " + i + " value: ");
			origArray[i] = reader.nextInt();
		}
		
		System.out.print("Input the limit value: ");
		lim = reader.nextInt();
		
		reader.close();
		
		//data processing
		
		for (int i = 0; i < origArray.length; i++) {
			
			if (origArray[i] > lim) {
				
				bigArray[quant] = origArray[i];
				
				quant++;
			}
		}
		
		//data output
		
		for (int i = 0; i < quant; i++) {
			
			System.out.println("bigArray[" + i + "] = " + bigArray[i]);
		}
	}
}
