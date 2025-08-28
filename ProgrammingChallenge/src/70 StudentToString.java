 class StudentToString {
    String name;
    int age;
    String rollNumber;
    String house;

// constructor
    public StudentToString(String name , int age , String rollNumber, String house){
        this.name = name;
        this.age = age;
        this.rollNumber =rollNumber;
        this.house = house;

    }

    @Override
    public String toString() {
        return "Student Details : {name:" + name
                + " , age: " + age
                + " , roll Number:" + rollNumber
                + " , house:" + house + "}";
    }

    public static void main(String[] args) {

        StudentToString Sd = new StudentToString("nandita" , 25 ,"001" ,
                "shivaji");

        System.out.println(Sd);

    }
}
