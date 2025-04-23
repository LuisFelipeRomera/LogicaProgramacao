//Calculates the mean velocity (km/h) and the quantity of gasoline required in liters
//by given distance (km), time (h) and consume (km/L)

package aula03;

import java.util.Scanner;

public class BoardComputer {
	public static void main(String[] args) {
		
		//Variable declaration
		
		double dist = 0;
		double time = 0;
		double cons = 0;
		double velM = 0;
		double fuel = 0;
		
		//Scanner declaration
		
		Scanner reader = new Scanner(System.in);
		
		//Data input
		
		System.out.print("input distance (km): ");
		dist = reader.nextDouble();
		
		System.out.print("input time (h): ");
		time = reader.nextDouble();
		
		System.out.print("input consume (km/L): ");
		cons = reader.nextDouble();
		
		// Close reader
		
		reader.close();
		
		//Data processing
		
		velM = dist / time;
		
		fuel = dist / cons;
		
		//Data output
		
		System.out.print("Mean Velocity: " + velM);
		System.out.print("Fuel required: " + fuel);
	}

}
