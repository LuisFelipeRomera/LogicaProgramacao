
public class TelephoneValidation {
	
	static boolean NumberValidation(String telephone) {
		
		if (telephone.length() != 17) {
			
			return false;
		}
		
		if (telephone.charAt(0) != '+') {
			
			return false;
		}
	
		try {
			
			Integer.parseInt(telephone.substring(1,3));
			
		} catch (Exception err) {
			
			return false;
		}
		
	}

}
