
public class PerfNum {

	public static void main(String[] args) {
		
		// Variable declaration
		
		int cand = 0;
		int divSum = 0;
		
		// Data processing
		
		while (true) {
			
			cand++;
			divSum = 0;
			
			for (int  i = 1; i <= (cand / 2); i++) {
				
				if ((cand % i) == 0) {
					
					divSum += i;
				}
			}
			
			if (cand == divSum) {
				
				System.out.println(cand);
			}
		}
		
	}
}
