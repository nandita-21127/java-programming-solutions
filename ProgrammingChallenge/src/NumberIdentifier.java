//create a program that determines if a number is positive, negative, or zero

import java.util.Scanner;

public class NumberIdentifier {
    public static void main(String[] args) {
        System.out.println("welcome to check your number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number");
        int num = input.nextInt();

        if (num>0&& num!=0){
            System.out.println("number is positive "+num);

        } else if (num <0) {
            System.out.println("number is negative "+num);

        }else {
            System.out.println("number is zero " + num);
        }

    }
}
