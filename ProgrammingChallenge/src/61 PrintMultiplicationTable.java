import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

class PrintMultiplicationTable {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to learn multiplication table ");

         System.out.print("enter your number you want to print table of: ");
         int num = input.nextInt();

         for(int i=1; i<=10; i++){
             System.out.println(num +  " X " + i + " = " + (num*i));

         }
     }
}
