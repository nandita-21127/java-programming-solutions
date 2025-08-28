public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] numArr = {{},{}};
        System.out.println(numArr.length);
        System.out.println(numArr[0].length);

        int[][] arr = new int[2][3];
        arr[0][0]=9;

        int[][] myArr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(myArr[0].length);

//        traversal of 2d

        int i=0;
        while (i< myArr.length){
            int j=0;
            while (j<myArr[i].length){
                System.out.print( myArr[i][j] +" " );
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
