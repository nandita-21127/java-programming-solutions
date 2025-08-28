package in.Kgcoding.equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Prashant", 31 , "001");
        Person person2 = new Person("Prashant", 30 , "001");

        if (person1.equals(person2)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
