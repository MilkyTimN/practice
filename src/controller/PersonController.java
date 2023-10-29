package controller;

import model.Person;
import model.enums.Gender;
import model.enums.Status;
import service.PersonService;
import service.impl.PersonServiceImpl;

import java.time.LocalDate;
import java.util.List;

public class PersonController {

    PersonService service = new PersonServiceImpl();

    public void save(Person person) {
        service.save(person);
    }


    public void saveAll(List<Person> personList) {
        service.saveAll(personList);
    }

    public List<Person> personList() {
        return service.getAll();
    }

    public void delete(Person person) {
        service.delete(person);
    }

    public void deleteAll(List<Person> personList) {
        service.deleteAll(personList);
    }

    public void update(Person person) {
        service.update(person);
    }

    public void changeBirthDate(String birthDate, Person person) {
        service.changeBirthDate(birthDate, person);
    }

    public List<Person> sortByDateElder(LocalDate localDate, boolean isElder){
        return service.sortByDateElder(localDate, isElder);
    }
    public List<Person> sortByFriendsCount(int count) {
        return service.sortByFriendsCount(count);
    }

    public List<Person> findByGender(Gender gender){
        return service.findByGender(gender);
    }
    public List<Person> findByStatus(Status status){
        return service.findByStatus(status);
    }
    public Person findByName(String name) {
        return service.findByName(name);
    }

    public List<Person> getAll() {
        return service.getAll();
    }
}
