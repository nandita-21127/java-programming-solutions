import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Day of the week detector \n");
        System.out.print("enter your day in number ");
        int day = input.nextInt();
        oldSwitch(day);
        newSwitch(day);

    }

    public static void newSwitch(int day){
        String dayStr = switch (day){
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6,7 -> "holiday";
            default -> "invalid day";
        };
        System.out.println(dayStr);
    }

    public static void oldSwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6: // fall through
            case 7:
                System.out.println("holiday");
                break;
            default:
                System.out.println("invalid day");
        }
    }


}
