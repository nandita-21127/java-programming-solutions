import java.util.Scanner;

public class SumOddNumber {
    public static void main(String[] args) {
        System.out.println("welcome. to find sum of all odd  numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = input.nextInt();
        int sum = oddSum(number);
        System.out.println("OddSum till " + number + " is: " + sum);

    }

    public static int oddSum(int num) {
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum = sum + i;
            i += 2;
        }
        return sum;
    }
}
