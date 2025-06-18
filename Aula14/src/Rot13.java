import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rot13 {
	
	public static void main(String[] args) {
		
		//variable declaration
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String text = "";
		
		String criptogram = "";
		
		//data input
		
		try {
			
			System.out.print("input the text: ");
			
			text = reader.readLine();
			
		} catch (Exception error ) {}
		
		//data processing
		
		criptogram = encrypt(text);
		
		//data output
		
		System.out.println(criptogram);
	}
	
	static String encrypt(String text) {
		
		String retur = "";
		
		for (int i = 0; i < text.length(); i++) {
			
			int OrigLetter = text.charAt(i);
			
			int EncryptLetter = (OrigLetter + 13);
			
			if (EncryptLetter > 122) {
				
				EncryptLetter -= 26;
			}
			
			retur += ((char) EncryptLetter);
		}
		
		return retur;
	}

}
