import java.util.Scanner;

public class InvertArray {
	public static void main(String[] args) {
		
		//variable declaration
		
		Scanner reader = new Scanner(System.in);
		
		int[] OrigArray = new int[5];
		int[] InvArray = new int[5];
		
		//data input
		
		for (int i = 0; i < OrigArray.length; i++) {
			
			System.out.print("type the position " + i + " value: ");
			OrigArray[i] = reader.nextInt();
		}
		
		reader.close();
		
		//data processing
		
		for (int i = (OrigArray.length - 1); i >= 0; i--) {
			
			InvArray[OrigArray.length - 1 - i] = OrigArray[i];
		}
		
		//data output
		
		for (int i = 0; i < InvArray.length; i++) {
			
			System.out.println("InvArray[" + i + "] = " + InvArray[i]);
		}
	}
}
