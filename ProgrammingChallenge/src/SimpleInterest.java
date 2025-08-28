import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("calculate simple interest");
        Scanner input = new Scanner(System.in);
        System.out.println("enter values of p r t");
        System.out.print("enter principal value: ");
        int principalValue = input.nextInt();
        System.out.print("enter rate: ");
        float rate = input.nextFloat();
        System.out.print("enter time: ");
        float time = input.nextFloat();

        float sI = (principalValue*rate*time)/100;

        System.out.println("\n simple interest is Rs. :" + sI);
    }
}
