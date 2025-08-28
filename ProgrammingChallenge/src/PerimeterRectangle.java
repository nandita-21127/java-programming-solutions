import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        System.out.println(" calculate Perimeter of rectangle \n");
        Scanner input = new Scanner(System.in);
        System.out.println("enter four sides of rectangle in cms");
        System.out.print("enter a side1 :");
        double side1 = input.nextDouble();
        System.out.print("enter a side2 :");
        double side2 = input.nextDouble();
        System.out.print("enter a side3 :");
        double side3 = input.nextDouble();
        System.out.print("enter a side4 :");
        double  side4 = input.nextDouble();

        double perimeter = side1 + side2 + side3 + side4;

        System.out.println("Perimeter of given sides is :" + perimeter + " cms");

    }
}
