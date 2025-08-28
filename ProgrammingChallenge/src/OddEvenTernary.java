import java.util.Scanner;

public class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("to check number is odd or even");
        System.out.print("enter your number: ");
        int num = input.nextInt();

        String result = num %2 ==0 ? "even" : "odd";

        System.out.println("number is " + result);
    }
}
