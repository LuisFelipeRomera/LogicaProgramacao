import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumSize {

	// function declaration

	static String ReadSize(int size) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String ret = "";
	
		do {
		
			try {
			
				System.out.print("Input a " + size + " size text: ");
			
				ret = reader.readLine();
			
			} catch (Exception error) {}
		
		} while (ret.length() != size);
	
		return ret;
	}
	
	public static void main(String[] args) {

		// Variable declaration
		int size = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//data input
		
		try {
			
			System.out.print("Input the size of the text: ");
			
			size = Integer.parseInt(reader.readLine());
			
		} catch (Exception error) {
			
			System.out.println("Error");
		}
		
		String text = ReadSize(size);
		
		System.out.println(text);
	}
}
