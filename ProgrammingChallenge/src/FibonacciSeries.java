import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("to find fibonacci series");
        Scanner input= new Scanner(System.in);
        System.out.println("enter your number up to which series ");
        int num = input.nextInt();
        System.out.println("here is the fibonacci series");
        printFibonacci(num);

    }
    public static void printFibonacci(int num){
        if(num<0) return;
        System.out.print("0 ");

        if (num==0) return;
        System.out.print("1 ");

        int first =0 , second=1;
        while(first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first =second;
            second =third;

        }
    }
}
