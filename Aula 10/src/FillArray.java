import java.util.Scanner;

public class FillArray {

	public static void main(String[] args) {
		
		//variable declaration
		Scanner reader = new Scanner(System.in);
		
		int[] array = new int[10];
		
		//data input
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print("input the position " + i + " value: ");
			
			array[i] = reader.nextInt();
		}
		
		reader.close();
		
		//data output
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("array[" + i + "] = " + array[i]);
			
		}
	}
}
