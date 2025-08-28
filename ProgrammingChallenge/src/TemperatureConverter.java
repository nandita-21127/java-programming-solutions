import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("convertor fahrenheit to celsius");
        Scanner input = new Scanner(System.in);
        System.out.print("enter your temp fahrenheit :");
        float fahr = input.nextFloat();

        float cel = (fahr - 32) * 5/9;

        System.out.println("degree in celsius :" + cel);



    }
}
