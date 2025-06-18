import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Integral {
	
	static double function(double x) {
		
		return x;
	}
	
	static double integ(double init, double end) {
		
		double retur = 0;
		
		double increment = 0.001;
		
		for (double i = init; i < end; i += increment) {
			
			retur += ((0.001) * function((i + (i + increment)) / 2));
		}
		
		return retur;
	}
	
	public static void main(String[] args) {
		
		//variable declaration
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		double init = 0;
		
		double end = 0;
		
		//data input
		
		try {
			
			System.out.print("input the begin: ");
			
			init = Double.parseDouble(reader.readLine());
			
			System.out.print("input the end: ");
			
			end = Double.parseDouble(reader.readLine());
		
		} catch (Exception error) {}
		
		//processing
		System.out.println("result: " + integ(init, end));
	}
}
