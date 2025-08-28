public class Function {
    public static void main(String[] args) {
//        System.out.println("in main method");
//        greetUser();
//        System.out.println("method calling complete");
        firstPattern();
    }

    public static void firstPattern(){
        int rows=0;
        while (rows<5){
            System.out.print("*");
            {
                int i=0;
                while (i<rows){
                    System.out.print(" *");
                    i++;
                }
                System.out.println();
            }
            rows++;
        }
    }
    public  static void greetUser(){
        System.out.println("Good Morning from kg coding");
    }
}
