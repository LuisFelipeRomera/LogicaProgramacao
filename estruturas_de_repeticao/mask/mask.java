import java.util.Scanner;

public class mask {

    public static void main(String args[]) {

        //Variable declaration
        int num = 0;

        Scanner reader = new Scanner(System.in);

        //data input
        do {

            System.out.print("input a number greater than 10: ");
            num = reader.nextInt();

            if (num <= 10) {

                System.out.print("number must be greater than 10");
            }
        } while (num <= 10);

        reader.close();

        //data output
        System.out.println("Password ok");
    }
}
