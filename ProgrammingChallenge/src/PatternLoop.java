import java.util.Scanner;

public class PatternLoop {
    public static void main(String[] args) {
        System.out.println("welcome to pattern world");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the no. of rows: ");
        int rows = input.nextInt();
        printRightHalfPyramid(rows);

        printReverseRightHalfPyramid(rows);
        printLeftHalfPyramid(rows);


    }

    public static void printRightHalfPyramid(int maxRows) {
        System.out.println("\nHere is Right half pyramid");
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void printReverseRightHalfPyramid(int maxRows) {
        System.out.println("\nHere is reverse Right half pyramid");
        int rows = maxRows;
        while (rows>0) {
            int i=0;
            while(i<rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }

    }
    public static void printLeftHalfPyramid(int maxRows) {
        System.out.println("\nHere is Left half pyramid");
        int rows = maxRows;
        while (rows>0) {
            int j=0;
            while(j<rows-1){
                //this loops print space
                System.out.print("  ");
                j++;
            }

            // this loops print stars
            int i=0;
            while (i<= (maxRows-rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }

    }

}
