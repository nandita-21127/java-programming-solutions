import java.util.Scanner;

public class ProductFloat {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("we are doing float multiplication");
        System.out.print("please enter your first decimal number:");
        double first = input.nextDouble();
        System.out.print("please enter your second decimal number:");
        double second = input.nextDouble();

        double floatMultiply = first * second;
        System.out.println("float numbers are multiplied: " + floatMultiply);
    }
}
