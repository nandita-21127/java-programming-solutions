import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

//      int num=1;
//    while (num<=10){
//        System.out.println( + num);
//        num= num +1;
//    }

    Scanner input = new Scanner(System.in);
    int i=0;
    while(i<5){

        int inp= input.nextInt();
        System.out.println("number is :" + inp);
        i = i+1;
    }

    }
}