import java.util.Scanner;

class CircleAreaCircum {

    double radiusInMm;

    CircleAreaCircum(double radiusInMm){
        this.radiusInMm =radiusInMm;
    }

    double getCircumference(){
        return 2 * radiusInMm * Math.PI;

    }
    double getArea(){
        return Math.PI * Math.pow(radiusInMm,2);
    }

     @Override
     public String toString() {
         return "Circle Props : Radius in mm: " + radiusInMm
                 +", Circumference in mm: " + getCircumference()
                 +", Area in mm2: " + getArea();
     }

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println(" welcome to the world of circle \n");
         System.out.print("please enter your radius: ");
         double radius = input.nextDouble();
         CircleAreaCircum circle = new CircleAreaCircum(radius);
         System.out.println(circle);

     }
}
