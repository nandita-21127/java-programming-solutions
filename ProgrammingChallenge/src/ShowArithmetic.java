import java.util.Scanner;

//program that takes two number and shows result of all arithmetic operators(+ - * / %)
public class ShowArithmetic {
    public static void main(String[] args) {

        System.out.println("welcome to Arithmetic operator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = input.nextInt();
        System.out.println("Enter second number :");
        int num2 = input.nextInt();

        System.out.println("add " + (num1 + num2));
        System.out.println("sub " + (num1 - num2));
        System.out.println("mult " + (num1 * num2));
        System.out.println("div " + (num1 / num2));
        System.out.println("modulo " + (num1 % num2));

    }
}