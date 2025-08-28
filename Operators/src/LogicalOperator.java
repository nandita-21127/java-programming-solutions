import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println("welcome to ticket discount calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age :");
        int age = input.nextInt();
        System.out.println(" are you a female? (true/false)");
        boolean isFemale =input.nextBoolean();

        if (age<5){
            System.out.println("you got 75% discount");
        } else if (isFemale) {
            System.out.println("you got 50% discount");

        } else if (age >60 && !isFemale) {
            System.out.println("you got 25% dicount");

        }else {
            System.out.println("you got no discount");
        }

    }
}
