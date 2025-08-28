package in.Kgcoding.equals;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
//defining own equals
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)){
            return false;
        }

        Person per = (Person) obj; // cast in person
        return per.name.equals(name) &&
                per.age == age &&
                per.id.equals(id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
