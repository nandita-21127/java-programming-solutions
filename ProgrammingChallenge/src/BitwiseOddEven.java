import java.util.Scanner;

public class BitwiseOddEven {
    public static void main(String[] args) {
        System.out.println("to check number is odd even by bitwise operator");
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int num = input.nextInt();

        if((num&1)==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }


    }
}
