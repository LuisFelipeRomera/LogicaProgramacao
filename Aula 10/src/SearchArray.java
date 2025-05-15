import java.util.Scanner;

public class SearchArray {
	public static void main(String[] args) {
		
		//variable declaration
		
		Scanner reader = new Scanner(System.in);
		
		int[] array = new int[10];
		int val = 0;
		int ind = - 1;
		
		//data input
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print("Input the position " + i + " value: ");
			array[i] = reader.nextInt();
		}
		
		System.out.print("type the value to be searched: ");
		val = reader.nextInt();
		
		reader.close();
		
		//data processing
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == val) {
				ind = i;
				break;
			}
		}
		
		//data output
		
		if (ind == - 1) {
			
			System.out.print("didn't find !");
		
		} else {
			
			System.out.print("The value " + val + " is in position " + ind);
		}
	}
}
