import controller.PersonController;
import model.Person;
import model.enums.Gender;
import model.enums.Status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(0, "Tim1", Gender.MALE, Status.ACTIVE, LocalDate.of(1999, 06, 10), null);
        Person person2 = new Person(1, "Tim2", Gender.MALE, Status.ACTIVE, LocalDate.of(2005, 06, 10), null);
        Person person3 = new Person(2, "Tim3", Gender.MALE, Status.INACTIVE, LocalDate.of(1980, 06, 10), null);
        Person person4 = new Person(3, "Tim4", Gender.MALE, Status.ACTIVE, LocalDate.of(1997, 06, 10), null);


        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        Person person5 = new Person(4, "Tim5", Gender.FEMALE, Status.ACTIVE, LocalDate.of(2002, 06, 10), personList);

        PersonController controller = new PersonController();
        controller.saveAll(personList);
        controller.save(person5);

        controller.changeBirthDate("01-01-1888", person1);
        System.out.println(controller.getAll());

    }
}