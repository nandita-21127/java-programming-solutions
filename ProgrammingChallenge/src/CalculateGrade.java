import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        System.out.println("to  calculate grade of students");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your percentage ");
        float percentage = input.nextFloat();

        if (percentage>=90){
            System.out.println("you have got A");
        }else if (percentage>=75){
            System.out.println("good , you have got B");

        } else if (percentage>=60) {
            System.out.println("work harder next time and got  C");

        }else if (percentage>=30){
            System.out.println("you seriously need to work  and got D");
        }else {
            System.out.println("sorry you have failed and got   E");
        }
    }
}
