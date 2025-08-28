//create a program to swap two numbers

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a first number: ");
        int num1 = input.nextInt();
        System.out.print("enter a second number: ");
        int num2 = input.nextInt();

        int temp= num1;
         num1 =num2;
         num2 =temp;
        System.out.println("swapped number");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);




    }
}

