import java.util.Scanner;

public class SwitchPrintMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to find  month of the year ");
        System.out.print("enter the month no. ");
        int monthNo = input.nextInt();
        printMonth(monthNo);

    }

    public static void printMonth(int month) {

        String output = switch (month) {
            case 1 -> "january";
            case 2 -> "february";
            case 3 -> "march";
            case 4 -> "april";
            case 5 -> "may";
            case 6 -> "june";
            case 7 -> "july";
            case 8 -> "august";
            case 9 -> "september";
            case 10 -> "october";
            case 11 -> "november";
            case 12 -> "december";
            default -> "invalid month";

        };
        System.out.println(output);
    }
}
