package functionalJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static functionalJava.Part_1.Gender.*;

public class Part_1 {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Esther", FEMALE),
                new Person("Peter", MALE),
                new Person("Blessing", FEMALE),
                new Person("Michael", MALE),
                new Person("Jacinta", FEMALE),
                new Person("Samuel", MALE));

// imperative approach in java
        List<Person> females = new ArrayList<>();

        for(Person person: people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for(Person female: females){
            System.out.println(female);
        }

        //declarative approach
        //the use of streams with collection in declarative java
        //streams allows for abstract mode to tell it what we want
        System.out.println();
        people.stream().filter(person ->
            FEMALE.equals(person.gender))
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name= name;
            this.gender=gender;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Person{");
            sb.append("name='").append(name).append('\'');
            sb.append(", gender=").append(gender);
            sb.append('}');
            return sb.toString();
        }
    }
    enum Gender {
        MALE, FEMALE
    }
}
