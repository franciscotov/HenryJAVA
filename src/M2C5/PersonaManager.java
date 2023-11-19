package M2C5;

import M2C5.classes.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonaManager {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Fran", "25", "football"));
        personList.add(new Person("Fran2", "15", "football2"));
        personList.add(new Person("Fran3", "35", "footbal3"));
        personList.add(new Person("Fran4", "45", "programar"));
        personList.add(new Person("Fran5", "55", "programar"));

        // Filter persons older than 18 years old and 'programar' hobby
        List<Person> personsOver18yearsOld = personList.stream()
                .filter(person -> (Integer.compare(Integer.parseInt(person.getAge()), 18) > -1 && person.getHobby() == "programar"))
                .collect(Collectors.toList());
        System.out.println(personsOver18yearsOld);

        // Get list of person's names
        List<String> namesOfPersons = personList.stream().map(p -> p.getName()).toList();
        System.out.println(namesOfPersons);

        // Limit list to 3 size
        List<Person> limitThree = personList.stream().limit(3).toList();
        System.out.println(limitThree);

        // Printing names of persons
        personList.forEach(p -> System.out.println(p.getName()));
    }
}
