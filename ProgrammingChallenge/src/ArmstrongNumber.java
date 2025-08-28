import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("welcome to check a no. is armstrong no.");
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        System.out.println(isArmstrong);
        if (isArmstrong){
            System.out.println("number is armstrong no.");
        }else {
            System.out.println("number is not armstrong ");
        }


    }
    public static boolean isArmstrong(int num){
        int noOfDigits =noOfDigit(num);
        System.out.println("no.of digits " + noOfDigits);
        int numCopy = num;
        int finalNumber=0;

        while(num>0){
            int lastDigit = num % 10;
            num /=10;
            finalNumber += pow(lastDigit,noOfDigits);

        }
        System.out.println("final number is  " + finalNumber);
        return finalNumber == numCopy;
    }

    public static int pow(int num1,int num2){
        int result =1;
        int i=0;
        while(i< num2){
            result *= num1;
            i++;
        }
        System.out.println("pow of " + num1 + " is "+  result );
        return result;
    }

    public static int noOfDigit(int num){
        int digits =0;
        while (num>0){
            digits++;
            num /=10;
        }
        return digits;
    }
}
