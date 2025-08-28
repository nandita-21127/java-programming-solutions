import java.util.Scanner;

class NumberGuessingGame {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         int num = 5 , guess ;
         System.out.println("welcome to the number guessing game");
         do {
             System.out.print("PLease guess the number between 0 to 10 : ");
             guess = input.nextInt();
         }while (num != guess);

         System.out.println("you have successfully guessed the number");
     }
}
