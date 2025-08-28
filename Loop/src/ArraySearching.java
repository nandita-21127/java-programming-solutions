import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3,6,8,87,65,4,68,23,9,98,34};
        System.out.println("welcome to array searching \n");
        System.out.print("enter the number you want to search : ");
        int num = input.nextInt();
        boolean isFound= isFound(arr,num);
        if (isFound){
            System.out.println("your number was found in the array :"+ num);
        }else {
            System.out.println("your number was not found in the array :"+ num);
        }
    }
    public  static boolean isFound(int[] arr , int num){

        int index=0;
        while(index< arr.length){
            if (arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
