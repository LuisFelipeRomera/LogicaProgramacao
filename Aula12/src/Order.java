import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Order {
	
	public static void main(String[] args) {
		
		//Variable declaration
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] vector = new String[10];
		
		//Data input
		try {
			for (int i = 0; i < vector.length; i++) {
			
				System.out.print("Input the text at the " + i + " index: ");
				vector[i] = reader.readLine();
			}
		} catch (Exception error) {
			
			System.out.println(error);
			
		}
	
		//Data processing
		
		for (int i = 0; i < (vector.length - 1); i++) {
			
			for (int j = (i + 1); j < vector.length; j++) {
				
				if (vector[i].compareTo(vector[j]) > 0) {
					
					String temp = vector[i];
					
					vector[i] = vector[j];
					
					vector[j] = temp;
				}
			}
		}
		
		//Data output
		
		for (int i = 0; i < vector.length; i++) {
			
			System.out.println(vector[i]);
		}
	}
}
