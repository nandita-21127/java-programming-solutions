import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
//taking input from user
        System.out.print("enter your special name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name + " also tell me your age");
        int age = input.nextInt();
        System.out.println(name + "  your age is : " + age);
    }
}
