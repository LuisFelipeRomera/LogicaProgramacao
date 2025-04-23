//Calculates the vote intention percentage for three candidates

package aula03;

import java.util.Scanner;

public class ElectionPoll {
	public static void main(String[] args) {
		
	
	//Variable declaration
	
	double candA = 0;
	double candB = 0;
	double candC = 0;
	double blnk = 0;
	double nll = 0;
	double vldTtl = 0;
	double total = 0;
	double prcA = 0;
	double prcB = 0;
	double prcC = 0;
	double prcBlnk = 0;
	double prcNll = 0;
	
	//Scanner declaration (ctrl + shft + o)
	
	Scanner reader = new Scanner(System.in);
	
	// Data input
	
	System.out.print("Input votes for candidate A: ");
	candA = reader.nextDouble();
	
	System.out.print("Input votes for candidate B: ");
	candB = reader.nextDouble();
	
	System.out.print("Input votes for candidate C: ");
	candC = reader.nextDouble();
	
	System.out.print("Input blank votes: ");
	blnk = reader.nextDouble();
	
	System.out.print("Input null votes: ");
	nll = reader.nextDouble();
	
	//Scanner close
	
	reader.close();
	
	//Data processing
	
	vldTtl = candA + candB + candC;
	
	total = candA + candB + candC + blnk + nll;
	
	prcA = (candA / (candA + candB + candC)) * 100;
	
	prcB = (candB / (candA + candB + candC)) * 100;
	
	prcC = (candC / (candA + candB + candC)) * 100;
	
	prcBlnk = (blnk / (total)) * 100;
	
	prcNll = (nll / (total)) * 100;
	
	//Data output
	
	System.out.print("Percentage candidate A: " + prcA + "\nPercentage candidate B: " 
			+ prcB + "\nPercentage candidate C: " + prcC + "\nPercentage blank: " 
			+ prcBlnk + "\nPercentage null: " + prcNll);

	}

}
