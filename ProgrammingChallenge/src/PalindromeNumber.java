import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("welcome to palindrome no.");
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("number is palindrome no.");
        } else {
            System.out.println("number is not palindrome no.");

        }

    }
    public static boolean isPalindrome(int num){
       int reverse = reverse(num);
       return  num == reverse;

    }

    public static int reverse (int num){
        int revNum = 0;
        while(num>0){
            int digit =num%10;
            revNum = revNum *10 +digit;
            num/=10;

        }


        return revNum ;

    }
}

