import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("to check no. is prime or not");
        Scanner input= new Scanner(System.in);
        System.out.print("enter your number");
        int number = input.nextInt();
        boolean isPrime = isPrime(number);
        if(isPrime){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }
    }

    public static boolean isPrime(int num){
        int i=2;
        while(i<num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

}
