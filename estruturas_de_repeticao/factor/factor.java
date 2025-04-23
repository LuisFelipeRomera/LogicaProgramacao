//This program gives the factorial of the input value

import java.util.Scanner;

public class factor {

    public static void main(String[] args) {

        //variable declaration
        int num = 0;
        int fact = 1;

        //Scanner declaration
        Scanner reader = new Scanner(System.in);

        //data input
        System.out.print("Input the number: ");
        num = reader.nextInt();

        for (int i = num; i > 0; i--) {

            fact = fact * i;
        }

        reader.close(); //reader close

        //data output
        System.out.println(num + "! = " + fact);
    }
}
