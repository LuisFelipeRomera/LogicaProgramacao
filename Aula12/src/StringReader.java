import java.util.Scanner;

public class StringReader {

	public static void main(String[] args) {
		
		//Variable declaration
		
		Scanner reader = new Scanner(System.in);
		String text = "";
		String remove = "";
		String search = "";
		int position = 0;
		int ocurrCount = 0;
		
		//Data input
		
		System.out.print("Input a text: ");
		text = reader.nextLine();
		
		System.out.print("Input the text to remove: ");
		remove = reader.nextLine();
		
		System.out.print("Input the text to search: ");
		search = reader.nextLine();
		
		reader.close();
		
		//Data processing
		
		System.out.println("First letter: " + text.substring(0, 1));
		
		System.out.println("Last letter: " + text.substring(text.length() - 1));
		
		System.out.println("Length: " + text.length());
		
		System.out.println("In upper case: " + text.toUpperCase());
		
		System.out.println("In case: " + text.toLowerCase());

		System.out.println("Removed: " + text.replaceAll(remove, ""));
		
		do {
			
			position = text.indexOf(search, position);
			
			if (position > - 1) {
				
				ocurrCount++;
				
				position++;
			}
			
		} while (position > 0);
		
		System.out.println("Ocurrence quantity: " + ocurrCount);
	}
}
