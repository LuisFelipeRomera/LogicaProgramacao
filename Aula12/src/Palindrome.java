import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		//Variable declaration
		
		Scanner reader = new Scanner(System.in);
		String text = "";
		boolean palindrome = true;
		
		//Data input
		System.out.print("Input a text: ");
		text = reader.nextLine();
		
		reader.close();
		
		//Data processing
		
		text = text.toLowerCase();
		text = text.replaceAll(" ", "");
		text = text.replaceAll("-", "");
		text = text.replaceAll(",", "");
		
		for (int i = 0; i < (text.length() / 2); i++) {
			
			if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
				
				palindrome = false;
			}
		}
		
		//Data output
		if (palindrome) {
			
			System.out.println("It's a palindrome.");
			
		} else {
			
			System.out.println("It isn't a palindrome.");
		}
	}

}
