import java.util.Scanner;

public class exp {

    public static void main(String[] args) {

        //Variable declaration
        int base = 0;
        int exp = 0;
        double rsult = 1;

        //data input
        
        Scanner reader = new Scanner(System.in); //Scanner declaration

        System.out.print("input the base: ");
        base = reader.nextInt();

        System.out.print("input the exponent: ");
        exp = reader.nextInt();

        for (int i = exp; i > 0; i--) {

            rsult = rsult * base;
        }

        reader.close(); //Scanner close

        //data output
        System.out.println(base + "^" + exp + " = " + rsult);

    }
}
