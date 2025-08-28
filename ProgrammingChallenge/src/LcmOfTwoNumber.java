import java.util.Scanner;

public class LcmOfTwoNumber {
    public static void main(String[] args) {
        System.out.println("welcome to find Lcm");
        Scanner input = new Scanner(System.in);
        System.out.print("enter your first number: ");
        int first = input.nextInt();
        System.out.print("enter your second number: ");
        int second = input.nextInt();
        int lcm = lcm(first,second);
        System.out.println("Lcm of two given number is : " + lcm);


    }
    public static int lcm(int first,int second){
        int i=1;
        while(true){
            int factor =first*i;
            if(factor %second ==0){
                return factor;
            }
            i++;
        }

       // return 0; // un reachable

    }
}
