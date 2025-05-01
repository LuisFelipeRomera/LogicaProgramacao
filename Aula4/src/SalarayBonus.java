import java.util.Scanner;

public class SalarayBonus {
	public static void main(String[] args) {
		//Variable declaration
		
		Scanner reader = new Scanner(System.in);
		int job = 0;
		double slry = 0;
		double nslry = 0;
		
		//data input
		
		System.out.print("input your job number: ");
		job = reader.nextInt();
		
		System.out.print("input your salary: ");
		slry = reader.nextDouble();
		
		reader.close();
		
		//data processing
		if (job == 1) {
			nslry = (slry * 1.1);
		} else if (job == 2) {
			nslry = (slry * 1.15);
		} else {
			nslry = (slry * 1.25);
		}
		
		//data output
		System.out.println("New salary is $" + nslry);
	}
}
