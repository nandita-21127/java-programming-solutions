import java.util.Scanner;

//create a program to input name of the person and respond with "welcome name to kg coding"
public class Challenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your name");
        String name = input.nextLine();
        System.out.println("WElCOME " + name + " to KG Coding");
    }
}
