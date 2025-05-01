import java.util.Scanner;

public class Maioridade {
	public static void main(String[] args) {
		//variables declaration
		
		Scanner reader = new Scanner(System.in);
		int age = 0;
		
		//data input
		
		System.out.print("input your age: ");
		age = reader.nextInt();
		
		reader.close();
		
		//data output
		
		if (age >= 18) {
			System.out.print("overage!");
		} else {
			System.out.print("underage!");
		}
	}
}
