import java.util.Scanner;

public class OccurrenceArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("welcome to array occurrence \n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("now enter the number you want to find: ");
        int num = input.nextInt();
        int occurrences = noOfOccurrence(numArr,num);
        System.out.println("your element was found " + occurrences + " times in the array ");
    }
    public static int noOfOccurrence(int[] numArr , int num){
        int occ =0;
        int i=0;
        while (i< numArr.length){
            if (numArr[i]==num){
                occ++;
            }
            i++;
        }

        return occ;
    }
}
