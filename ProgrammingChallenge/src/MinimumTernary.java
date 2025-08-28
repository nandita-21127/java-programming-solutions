import java.util.Scanner;

public class MinimumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to find minimum of two number ");
        System.out.print("enter your 1 number: ");
        int num1 = input.nextInt();
        System.out.print("enter your 2 number: ");
        int num2 = input.nextInt();

//        int minNum= num1<num2 ? num1:num2;
//
//        System.out.println("minimum number is " + minNum);
        MinimumTernary ternary = new MinimumTernary();
        int min = ternary.min(num1, num2);
        System.out.println("Minimum number is : " + min);
    }

    public int min(int num1 , int num2){
        return num1<num2 ? num1 : num2;
    }
}
