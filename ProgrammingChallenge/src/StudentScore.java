import java.util.Scanner;

// using ternary operator to solve this
public class StudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to student score checker \n");
        System.out.print("please enter your marks ");
        int marks = input.nextInt();

        String category =  marks>80 ? "High" : (marks >50 ? "moderate" : "low");

        System.out.println(" score of the student is : " + category);

    }


}
