import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("hello,now we will add all digit in given integer");
        Scanner input = new Scanner(System.in);
        System.out.print("enter your digit: ");
        int digit = input.nextInt();
        int sum = sumDigit(digit);
        System.out.println("sum of the digits: " + sum);
    }

    public static int sumDigit(int num){
        int sum=0;
        while(num>0) {
//            sum = sum + (num % 10);
//            num = num / 10;
            sum += num % 10;
            num /=10;

        }
        return sum;
    }
}
