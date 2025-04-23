import java.util.Scanner;

public class sumfunc {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int ind = 0;
        double sum = 0;

        //data input
        System.out.print("input the index: ");
        ind = reader.nextInt();

        for (int i = ind; i > 0; i--) {

            sum += Math.pow( i, 2) + 3 * i + 2;
        } 

        reader.close();

        System.out.println(sum);
    }
}
