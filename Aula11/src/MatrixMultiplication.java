import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		
		//Variable declaration
		
		Scanner reader = new Scanner(System.in);
		
		int[][] mat1 = new int [2][3];
		int[][] mat2= new int [3][2];
		int[][] rest = new int[2][2];
		
		//Data input
		
		for (int i = 0; i < mat1.length; i++) {
			
			for (int j = 0; j < mat1[i].length; j++) {
				
				System.out.print("Matrix 1[" + i +  "][" + j + "] = ");
				mat1[i][j] = reader.nextInt();
			}
		}
		
		for (int i = 0; i < mat2.length; i++) {
			
			for (int j = 0; j < mat2[i].length; j++) {
				
				System.out.print("Matrix 2[" + i +  "][" + j + "] = ");
				mat2[i][j] = reader.nextInt();
			}
		}
		
		reader.close();
		
		//Data processing
		
		for (int i = 0; i < rest.length; i ++) {
			
			for (int j = 0; j < rest[i].length; j++) {
				
				for (int k = 0; k < mat2.length; k++) {
					
					rest[i][j] += (mat1[i][k] * mat2[k][j]);
				}
			}
		}
		
		//Data output
		
		for (int i = 0; i < rest.length; i++) {
			
			for (int j = 0; j < rest[i].length; j++) {
				
					System.out.print(rest[i][j] + "\t");
			}
			
			System.out.println();
		}

	}
}
