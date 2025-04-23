//This program returns the aritmetic mean of the grades of a student, 
//with the user inputting the number of tests and the grades of each of then

import java.util.Scanner;

public class grades {

    public static void main(String[] args) {

        //Variable declaration
        int num = 0; //number of tests 
        double score = 0; //score in each test 
        double mean = 0; //aritmetic mean of the scores
        double sum = 0; //sum of the scores 

        //data input
        Scanner reader = new Scanner(System.in); //Scanner declaration
        
        System.out.print("Input the number of tests: ");
        num = reader.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.print("Input the score of the tests: ");
            score = reader.nextDouble();

            sum = sum + score;
        }

        mean = sum / num;

        reader.close(); //Scanner close

        //data output
        System.out.println("the aritmetic of the grades are " + mean);

    }
}
