public class StringFormat {
    public static void main(String[] args) {
        String name ="sandeep";
        int marks =45456467;
        System.out.println("hello " + name + " , your marks are: " + marks);



        System.out.printf("Hello %S , your marks are: %d %n" , name , marks);
        System.out.printf("Hello %-10s , your marks are: %d %n" , name , marks);
        System.out.printf("Hello %s , your marks are: %0,5d  %n" , name , marks);
        System.out.printf("Hello %-10S , your marks are: %d %n" , name , marks);
    }
}
