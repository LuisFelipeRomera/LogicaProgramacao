package aula06;

import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		
		//variable declaration
		
		Scanner reader = new Scanner(System.in);
		
		double initial_balance = 0;
		int op = 0;
		double value = 0;
		double final_balance = 0;
		
		//data input
		
		System.out.print("Input initial balance: ");
		initial_balance = reader.nextDouble();
		
		System.out.print("Type <1> for withdraw or <2> for deposit");
		op = reader.nextInt();
		
		System.out.print("Input value");
		value = reader.nextDouble();
		
		reader.close();
		
		//data processing
		
		if (op == 1) { 
			
			final_balance = initial_balance - value;
		
		} else if (op == 2) {
			
			final_balance = initial_balance + value;
			
		} else {
			
			final_balance = initial_balance;
			
		}
		
		//data output
		
		System.out.print("Your balance is: " + final_balance);
				
	}

}
