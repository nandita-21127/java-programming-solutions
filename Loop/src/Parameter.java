public class Parameter {
    public static void main(String[] args) {

//        int num = sumTwoNumbers(4,7);
//        System.out.println(num);

        System.out.println(sumTwoNumbers(4,7));
        System.out.println(sumTwoNumbers(5,-687));
        System.out.println(sumTwoNumbers(1234,456));
        System.out.println(sumTwoNumbers(-456,-56));
    }
    public static int sumTwoNumbers(int first,int second){
        System.out.println("first no. received: "+ first);
        System.out.println("second no. received: "+ second);
        int sum = first + second;
        return sum;

    }
}
