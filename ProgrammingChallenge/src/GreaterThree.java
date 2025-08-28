import java.util.Scanner;

public class GreaterThree {
    public static void main(String[] args) {
        System.out.println("welcome to check your number is greater");
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number1: ");
        int num1= input.nextInt();
        System.out.print("enter your number2: ");
        int num2= input.nextInt();
        System.out.print("enter your number3: ");
        int num3= input.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("number 1 is greater " + num1);
        }else if (num2>=num3){
            System.out.println("number 2 is greater " +num2);

        }else {
            System.out.println("number 3 is greater "+ num3);
        }
    }
}
