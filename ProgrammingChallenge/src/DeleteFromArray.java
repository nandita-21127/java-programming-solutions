import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to array deletion");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("enter the number you want to delete");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr,numToDelete);
        System.out.println("here is your new array");
        ArrayUtility.displayArray(newArr);


    }
    public static int[] deleteNumber(int[] numArr , int numToDelete){
        int occ = OccurrenceArray.noOfOccurrence(numArr,numToDelete);
        if (occ==0){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i=0,j=0;
        while (i<numArr.length){
            if (numArr[i] != numToDelete){
                newArr[j] =numArr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
}
