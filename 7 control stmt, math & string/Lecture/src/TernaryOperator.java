import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to number checker");
        System.out.print("please enter your first number ");
        int num1 = input.nextInt();
        System.out.print("please enter your second number ");
        int num2 = input.nextInt();

//        int greaterNumber;
//        if(num1>num2){
//            greaterNumber = num1;
////            System.out.println( num1 +" is the  greater");
//        }else{
//            greaterNumber = num2;
////            System.out.println(num2 + " is the greater");
//        }

        int greaterNumber = num1>num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greater");

    }
}
