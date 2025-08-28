import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("welcome to compound interest calculator");
        Scanner input =new Scanner(System.in);
        System.out.print("enter your principal amount Rs: ");
        int principal = input.nextInt();
        System.out.print("enter your rate ");
        float rate = input.nextFloat();
        System.out.print("enter your time in years: ");
        float time = input.nextFloat();

        double compInt = principal* Math.pow(1+ rate/100,time);

        System.out.println("\n compound interest :" + compInt + "Rs.");
    }
}
