import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Calculate Area of triangle");
        Scanner input = new Scanner(System.in);
        System.out.println("enter base and height of triangle");
        System.out.print("enter a base in cms :");
        double base = input.nextDouble();
        System.out.print("enter a height in cms:");
        double height = input.nextDouble();

        double areaOfTriangle =  (0.5 * (base * height));

        System.out.println("Area of Triangle is :" + areaOfTriangle + " cms2");

    }
}
