import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        System.out.println("to check bitwise operator");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the first number");
        int first = input.nextInt();
        System.out.print("please enter the second number");
        System.out.print("please enter the second number");
        int second = input.nextInt();

        int result1 = first & second;
        System.out.println("\n result is :" +result1);

        int result2 = first|second;
        System.out.println("\n result is :" + result2);

        int result3 = first ^ second ;
        System.out.println("\n result is :" + result3);

        int result4 = ~first;
        System.out.println( "\n result is :" + result4);

//        number is multiply by 2

        int lshift = first<<4;
        System.out.println("\n result is showing left shift :" + lshift);

//        number is divided by 2
        int rshift = first>>2;
        System.out.println("\n result is showing right shift:" + rshift);


    }
}
