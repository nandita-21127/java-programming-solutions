public class TypeConversion {
    public static void main(String[] args) {
        float myNumber =45L;
        System.out.println(myNumber);

//        explicit

        int myInt = (int)5.0f;
        System.out.println(myInt);
        int myInt1 = (int)5.45f;
        System.out.println(myInt1);

        float eDec = (float) 3.5;
        long eBig = (long) 3.4;
        System.out.println(eBig);
        System.out.println(eDec);

    }
}
