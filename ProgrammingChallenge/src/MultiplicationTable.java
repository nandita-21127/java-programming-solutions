import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("welcome to read multiplication table\n");
        Scanner input = new Scanner(System.in);
        System.out.println("enter your favourite number");
        int num = input.nextInt();
        tableOfNumber(num);

    }
    public static void tableOfNumber(int number){
        int i=1;
        while (i<=10){
            System.out.println(number + "x" + i + " = "+ (number*i));
            i= i+1;
        }

    }

}
