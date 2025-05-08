
public class Fibonacci {
	public static void main(String[] args) {
		
		// Variable declaration
		
		double prev = 1;
		double curr = 1;
		double futr = 0;
		
		// Processing
		System.out.println(prev);
		System.out.println(curr);
		
		while (true) {
			
			futr = (curr + prev);
			
			System.out.println(futr);
			
			prev = curr;
			
			curr = futr;
			
			try {Thread.sleep(100);} catch(Exception e) {}
			
		}
	}
}
