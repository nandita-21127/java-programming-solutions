//create a program to add two numbers

import java.sql.SQLOutput;
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        System.out.println("Welcome to our calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("enter first numbers");
        int num1 = input.nextInt();
        System.out.print("enter second numbers");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("sum of two numbers : " + sum);

    }
}
