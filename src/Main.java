import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main {

    private static List<Person> personList() {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Alex", "Petrov-Ivanov", 20));
        person.add(new Person("Katrine", "Gonzalez Fernandez, Jose", 18));
        person.add(new Person("Max", "Alexandros", 30));
        person.add(new Person("Mary", "Johnson-Frederik", 22));

        return person;
    }

    public static void main(String[] args) {
        List<Person> person = personList();
        Collections.sort(person, new SurnameAgeComparator(1));
        System.out.println(person);
    }
}