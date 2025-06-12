import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IntegerMask {

	//Function declaration

	static int IntMask() {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int end = 0;

		boolean contin = false;
		
		do {

			try {

				System.out.print("Input an integer: ");

				end = Integer.parseInt(reader.readLine());

				contin = false;

			} catch (Exception err) {

				System.out.println("Type integer values!");

				contin = true;

			}

		} while (contin);

		

		return end;

	}

	

	// Main function 

	public static void main(String[] args) {

		// Variable declaration

		int num = 0;

		// Data input

		num = IntMask();

		// Data output

		System.out.println(num); 

	}

}

