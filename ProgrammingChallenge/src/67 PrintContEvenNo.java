import java.util.Scanner;

class PrintContEvenNo {
    public static void main(String[] args) {
        System.out.println("welcome to print even number using continue");
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number : ");
        int num = input.nextInt();

        for (int i = 0; i<num; i++){
            if (i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }
    }
}
