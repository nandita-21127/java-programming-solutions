package in.Kgcoding.Inheritance;

public class TwoWheeler extends Vehicle{
    TwoWheeler(){
        setNumberOfTires(2);
    }

    public void balance(){
        System.out.println("I am balancing on two tires");
    }
}
