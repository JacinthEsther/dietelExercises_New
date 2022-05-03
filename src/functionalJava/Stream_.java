package functionalJava;

import java.util.List;
import java.util.stream.Collectors;

import static functionalJava.Stream_.Gender.*;

public class Stream_ {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Esther", FEMALE),
                new Person("Peter", MALE),
                new Person("Blessing", FEMALE),
                new Person("Michael", MALE),
                new Person("Jacinta", FEMALE),
                new Person("Samuel", MALE));

        people.stream().map(person-> person.name.length())
//                .collect(Collectors.toSet()) //with set there is no duplicate
                .forEach(System.out::println);// for each take in a consumer, it takes an argument and returns a void

    }
    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }
    enum Gender {
        MALE, FEMALE
    }
}
