import java.util.Scanner;

class ForLoopIsPrime {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to check number is prime or not");
         System.out.print("enter your number to check: ");
         int num = input.nextInt();
//         boolean isPrime= isPrime(num);
         System.out.println("your number is "
                 + (isPrime(num) ? " prime " : "not prime "));
     }

     public static boolean isPrime(int num){

         for (int i=2; i<num; i++){
             if(num % i ==0){
                 return false;
             }
         }
         return true;
     }
}
