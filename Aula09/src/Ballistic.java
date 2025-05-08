import java.util.Scanner;

public class Ballistic {
	
	public static void main(String[] args) {
		
		//Variable declaration
		
		Scanner reader = new Scanner(System.in);
		
		double ang = 0;
		double vel = 0;
		double dist = 0;
		double time = 0;
		double grav = 9.8;
		
		//Data input
		
		System.out.print("enter the launch angle: ");
		ang = reader.nextDouble();
		
		System.out.print("Enter the launch initial velocity: ");
		vel = reader.nextDouble();
		
		reader.close();
		
		//Processing
		
		ang = ((Math.PI * ang) / 180);
		time = ((2 * vel * Math.sin(ang)) / grav);
		
		for (double i = 0; i < time; i++) {
			
			dist = (vel * Math.cos(ang) * i);
			System.out.println(i + "\t" + dist);
		}
		
		dist = ((Math.pow(vel, 2) * Math.sin(2 * ang)) / grav);
		
		//Data output
		System.out.println("Final time: " + time);
		System.out.println("Final distance: " + dist);
	}

}
