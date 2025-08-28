import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("to find reverse of number");
        Scanner input= new Scanner(System.in);
        System.out.println("enter your  number");
        int number = input.nextInt();
        int reverse = reverse(number);
        System.out.println("reverse of number: " + reverse);
    }

    public static int reverse(int num){
        int newNum =0;
        while(num>0){
            int digit = num%10;
            newNum = newNum*10 + digit;
            num/=10;

        }

        return newNum;
    }
}
