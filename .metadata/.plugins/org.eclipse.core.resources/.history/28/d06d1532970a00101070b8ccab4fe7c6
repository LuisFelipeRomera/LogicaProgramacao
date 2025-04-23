//Calculates the quantity of tiles to coat a retangular pool, given the length, depth, width 
//and tile size

package aula03;

import java.util.Scanner;

public class PoolTiles {
	public static void main(String[] args) {
		
		//Variable declaration
		double lngt = 0;
		double wdth = 0;
		double dpth = 0;
		double tile = 0;
		
		double lrgwll = 0;
		double thnwll = 0;
		double flrr = 0;
		double srfc = 0;
		double tlqt = 0;
		
		//Scanner declaration
		
		Scanner reader = new Scanner(System.in);
		
		//Data input
		
		System.out.print("Input lenght: ");
		lngt = reader.nextDouble();
		
		System.out.print("Inout Width: ");
		wdth = reader.nextDouble();
		
		System.out.print("Input depth: ");
		dpth = reader.nextDouble();
		
		System.out.print("Input tile size: ");
		tile = reader.nextDouble();
		
		//Scanner close
		
		reader.close();
		
		//Data processing
		
		lrgwll = lngt * dpth;
		
		thnwll = wdth * dpth;
		
		flrr = lngt * dpth;
		
		srfc = (2 * lrgwll) + (2 * thnwll) + flrr;
		
		tlqt = srfc / Math.pow(tile, 2);
		
		//Data output
		
		System.out.print(tlqt + " tiles necessary");
	}

}
