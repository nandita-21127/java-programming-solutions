import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to switch calculator \n ");
        System.out.print("enter your 1 number : ");
        int num1 = input.nextInt();
        System.out.print("enter your 2 number : ");
        int num2 = input.nextInt();
        System.out.print("enter your operation : ");
        String opr = input.next();
        int solution = calculator(num1,num2,opr);

        System.out.println("solution of " + num1 + " and " + num2 + " = " + solution);


    }

    public static int calculator(int num1, int num2 , String opr){

        return switch (opr){
            case "+" -> num1 + num2 ;
            case "-" -> num1 - num2 ;
            case "*" -> num1 * num2 ;
            case "/" -> num1 / num2 ;
            default -> -1;

        };

    }


}
