import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person e1 = new Employee("John", "Lennon", "Musician", 27045.78);
        Person e2 = new Employee("George", "Harrison", "Musician", 50000.0);
        Person s1 = new Student("Ringo", "Starr", 2.5);
        Person s2 = new Student("Paul", "McCartney", 3.8);
        List<Person> people = new ArrayList();
        people.add(e1);
        people.add(e2);
        people.add(s1);
        people.add(s2);
        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}
