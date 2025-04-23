//This program lets the user input the number of values it wants to sum, and than lets the user type the values.

import java.util.Scanner;

public class sum {

    public static void main(String[] args) {

        //variable declaration
        int num = 0; //number of values to sum
        double val = 0; //values to sum
        double sum = 0;

        //Scanner declaration
        Scanner reader = new Scanner(System.in);

        //data input
        System.out.print("type the number of values to sum: ");
        num = reader.nextInt();
        for (int i = 0; i < num; i++) {

            System.out.print("type the value to sum: ");
            val = reader.nextDouble();

            sum = sum + val;
        }

        reader.close(); //Scanner close

        //data output
        System.out.println("sum = " + sum);

    }
}
