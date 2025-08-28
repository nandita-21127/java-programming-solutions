import java.util.Scanner;

public class Return {
    public static void main(String[] args) {

        greet();
        int first =readNumber()+1;
        int second = readNumber()+2;

        int sum = first+second;

        System.out.println("sum of two numbers" +sum);

    }

    public static void greet(){
        System.out.println("welcome to calculator");

    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the  number : ");
        int number = input.nextInt();
        return number;

    }
}
