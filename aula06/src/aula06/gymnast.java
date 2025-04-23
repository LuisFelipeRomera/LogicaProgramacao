package aula06;

import java.util.Scanner;

public class gymnast {

		public static void main(String[] args) {
			
			//data input
			
			Scanner reader = new Scanner(System.in);
			
			double n1 = 0;
			double n2 = 0;
			double n3 = 0;
			double n4 = 0;
			double n5 = 0;
			double n6 = 0;
			double var = 0;
			double mean = 0;
			
			//data input
			
			System.out.print("Input first score");
			n1 = reader.nextDouble();
			
			System.out.print("Input second score");
			n2 = reader.nextDouble();
			
			System.out.print("Input third score");
			n3 = reader.nextDouble();
			
			System.out.print("Input fourth score");
			n4 = reader.nextDouble();
			
			System.out.print("Input fifth score");
			n5 = reader.nextDouble();
			
			System.out.print("Input sixth score");
			n6 = reader.nextDouble();
			
			//data processing
			
			if (n1 > n2) {
				
				n1 = var;
				n2 = n1;
				var = n2;
			}
			
			if (n2 > n3) {
				
				n2 = var;
				n3 = n2;
				var = n3;
			}
			
			if (n3 > n4) {
				
				n3 = var;
				n4 = n3;
				var = n4;
			}
			
			if (n4 > n5) {
				
				n4 = var;
				n5 = n4;
				var = n5;
			}
			
			if (n5 > n6) {
				
				n5 = var;
				n6 = n5;
				var = n6;
			}
			
			if (n1 < n2) {
				
				n1 = var;
				n2 = n1;
				var = n2;
			}
			
			if (n2 < n3) {
				
				n2 = var;
				n3 = n2;
				var = n3;
			}
			
			if (n3 < n4) {
				
				n3 = var;
				n4 = n3;
				var = n4;
			}
			
			if (n4 < n5) {
				
				n4 = var;
				n5 = n4;
				var = n5;
			}
			
		} 
}
