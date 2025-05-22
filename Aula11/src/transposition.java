import java.util.Scanner;

public class transposition {
	public static void main(String[] args) {
		
		//Variable declaration
		
		Scanner reader = new Scanner(System.in);
		
		int[][] origMat = new int[2][3];
		int[][] transMat = new int[3][2];
		
		//Data input
		
		for (int i = 0; i < origMat.length; i++) {
			
			for (int j = 0; j < origMat[i].length; j++) {
				
				System.out.print("Original matrix[" + i + "][" + j + "] = ");
				origMat[i][j] = reader.nextInt();
			}
		}
		
		reader.close();
		
		//Data processing
		
		for (int i = 0; i < origMat.length; i++) {
			
			for (int j = 0; j < origMat[i].length; j++) {
				
				transMat[j][i] = origMat[i][j];
			}
		}
		
		//Data output
		
		System.out.println("! Original matrix !");
		
		for (int i = 0; i < origMat.length; i++) {
			
			for (int j = 0; j < origMat[i].length; j++) {
				
				System.out.print(origMat[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("! Transposed matrix !");
		
		for (int i = 0; i < transMat.length; i++) {
			
			for (int j = 0; j < transMat[i].length; j++) {
				
				System.out.print(transMat[i][j] + "\t");
			}
			
			System.out.println();
		}
	}
}
