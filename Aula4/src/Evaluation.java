import java.util.Scanner;

public class Evaluation {
  public static void main(String[] args) {
	//variable declaration
	Scanner reader = new Scanner(System.in);
	
	double grade1, grade2, grade3, gradesubs, mean;
	
	//data input
	
	System.out.print("input your grade on first test: ");
	grade1 = reader.nextDouble();
	
	System.out.print("input your grade on second test: ");
	grade2 = reader.nextDouble();
	
	System.out.print("input your grade on third test: ");
	grade3 = reader.nextDouble();
	
	//processing
	
	mean = (grade1 + grade2 + grade3) / 3;
	
	//data output
	if (mean >= 5) {
		System.out.println("Aproved");
	} else { 
		System.out.print("input substitute test grade: ");
		gradesubs = reader.nextDouble();
		
		if (gradesubs >= 5) {
			System.out.println("Aproved");
		} else {
			System.out.println("Reproved");
		}
		
		reader.close();    
		
		
	}
			
}
}
