import java.util.Scanner;

public class Cedulas {
	public static void main(String[] args) {
		
		//variable declaration
		
		int value, qtt200, qtt100, qtt50, qtt20, qtt10, qtt5, qtt2, qtt1;
		Scanner reader = new Scanner(System.in);
		
		//data input
		System.out.print("input the cash out value: ");
		value = reader.nextInt();
		
		reader.close();
		
		//data processing
		qtt200 = (value / 200);
		value = (value % 200);
		
		qtt100 = (value / 100);
		value = (value % 100);
		
		qtt50 = (value / 50);
		value = (value % 50);
		
		qtt20 = (value / 20);
		value = (value % 20);
		
		qtt10 = (value / 10);
		value = (value % 10);
		
		qtt5 = (value / 5);
		value = (value % 5);
		
		qtt2 = (value / 2);
		value = (value % 2);
		
		qtt1 = (value / 1);
		value = (value % 1);
		
		//data output
		
		if (qtt200 > 0) {
			System.out.println(qtt200 + "200 bills");
		}
			
		if (qtt100 > 0) {
			System.out.println(qtt100 + "100 bills");
		}
		
		if (qtt50 > 0) {
			System.out.println(qtt50 + "50 bills");
		}
		
		if (qtt20 > 0) {
			System.out.println(qtt200 + "20 bills");
		}
		
		if (qtt10 > 0) {
			System.out.println(qtt200 + "10 bills");
		}
		
	}

}
