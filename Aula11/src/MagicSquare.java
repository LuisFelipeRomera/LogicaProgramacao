import java.util.Scanner;

public class MagicSquare {
	public static void main(String[] args) {
		
		//Variable declaration
		
		Scanner reader = new Scanner(System.in);
		
		int[][] magSqr = new int[3][3];
		boolean magic = true;
		int magNum = 0;
		int sum = 0;
		
		//Data input
		
		for (int i = 0; i < magSqr.length; i++) {
			
			for (int j = 0; j < magSqr[i].length; j++) {
				
				System.out.print("Magic square[" + i +  "][" + j + "] = ");
				magSqr[i][j] = reader.nextInt();
			}
		}
		
		reader.close();
		
		//Data processing
		
		for (int i = 0; i < magSqr.length; i++) {
			
			magNum += magSqr[i][i]; //clockwise diagonal
		}
		
		sum = 0;
		
		for (int i = 0; i < magSqr.length; i++) { //counter clockwise diagonal
			
			sum += magSqr[i][magSqr.length - 1 - i];
		}
		
		if (magNum != sum) {
			
			magic = false;
		}
		
		for (int i = 0; i < magSqr.length; i++) { //Lines
			
			sum = 0;
			
			for (int j = 0; j < magSqr[i].length; j++) {
				
				sum += magSqr[i][j];
			}
			
			if (magNum != sum) {
				
				magic = false;
			}
		}
		
		for (int i = 0; i < magSqr.length; i++) { //Columns
			
			sum = 0;
			
			for (int j = 0; j < magSqr[i].length; j++) {
				
				sum += magSqr[i][j];
			}
			
			if (magNum != sum) {
				
				magic = false;
			}
		}
		
		//Data output
		
		if (magic) {
			
			System.out.println("It's a magic square!");
			
		} else {
			
			System.out.println("It isn't a magic square!");
		}
		
		
	}
}
