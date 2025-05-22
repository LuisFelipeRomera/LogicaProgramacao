import java.util.Scanner;

public class Determinant {
	
	public static void main(String[] args) {
		
		//variable declaration
		
		Scanner reader = new Scanner(System.in);
		
		int [][] matrix = new int [3][3];
		
		int det = 0;
		
		//Data input
		
		for (int i = 0; i < matrix.length ; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				System.out.print("matrix[" + i + "][" + j + "] = ");
				matrix[i][j] = reader.nextInt();
			}
		}
		
		reader.close();
		
		//data processing
		
		det =  (matrix[0][0] * matrix[1][1] * matrix[2][2] +
				matrix[0][1] * matrix[1][2] * matrix[2][0] +
				matrix[0][2] * matrix[2][1] * matrix[1][0] +
				matrix[0][2] * matrix[1][1] * matrix[2][0] +
				matrix[0][0] * matrix[2][1] * matrix[1][2] +
				matrix[0][1] * matrix[1][0] * matrix[2][2]);
		
		//Data output
		
		System.out.println("The matrix determinant is: " + det);
	}

}
