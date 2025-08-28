import java.util.Scanner;

public class IsOddEven {
    public static void main(String[] args) {
        System.out.println("to check number is odd or even");
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number");
        int num1 = input.nextInt();

        if(num1 % 2==0){
            System.out.println("number is even");
        }else {
            System.out.println("number is odd");
        }
    }
}
