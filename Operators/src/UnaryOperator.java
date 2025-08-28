public class UnaryOperator {
    public static void main(String[] args) {

        int x=5;
        int y=-x;
        int z=-y;
        System.out.println("x "+ x);
        System.out.println("y "+ y);
        System.out.println("z "+ z);

        int a= 7;
        a= a+1;
        System.out.println(a);
        a +=1;
        System.out.println(a);
        a++;
        System.out.println(a);

        System.out.println("watching increment");
        int p=5;
        System.out.println(p++);
        System.out.println(p);

        System.out.println(++p);
        System.out.println(p);
        System.out.println("watching decrement \n \n");
        int q=8;
        System.out.println(--q);
        System.out.println(q);

        System.out.println(q--);
        System.out.println(q);


    }
}
