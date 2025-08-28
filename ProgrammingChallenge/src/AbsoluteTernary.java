import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Absolute value \n");
        System.out.print("enter your number ");
        int num = input.nextInt();

        int absoluteValue = num >0 ? num : (-num);

        System.out.println("absolute value of " + num + " " + absoluteValue);
    }
}
