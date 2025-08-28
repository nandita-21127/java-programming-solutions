import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        System.out.println("to check given year is leap year or not");
        Scanner input = new Scanner(System.in);
        System.out.print("enter your year  ");
        int year = input.nextInt();
//considering conditions like divisible by 4 but not 100,unless also divisible by 400

        if (year%400==0 || (year%4==0 && year%100 != 0)){
            System.out.println("your year is a leap year");
        }else {
            System.out.println("your year is not a leap year");
        }
    }
}
