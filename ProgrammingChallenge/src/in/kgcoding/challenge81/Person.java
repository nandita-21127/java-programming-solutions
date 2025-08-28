package in.kgcoding.challenge81;

import java.util.Objects;

public class Person {

    public String name;
    public int age;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
