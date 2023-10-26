package service.impl;

import model.Person;
import model.enums.Gender;
import model.enums.Status;
import repository.PersonRepository;
import service.PersonService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService {


    PersonRepository repository = new PersonRepository();

    @Override
    public void save(Person person) {

    }

    @Override
    public void saveAll(List<Person> people) {

    }

    @Override
    public List<Person> findByGender(Gender gender) {
        return null;
    }

    @Override
    public List<Person> findByStatus(Status gender) {
        return null;
    }

    @Override
    public Person findByName(String name) {
        return null;
    }

    @Override
    public void deleteAll(List<Person> peopleToDelete) {

    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public void update(Person person) {

        Person personFromDB = repository.getById(person.getId());

        personFromDB.setName(person.getName());
        personFromDB.setBirthDate(person.getBirthDate());
        personFromDB.setGender(person.getGender());
        personFromDB.setStatus(person.getStatus());
        personFromDB.setFriends(person.getFriends());

        repository.update(personFromDB);

    }

    @Override
    public List<Person> sortByDateElder(LocalDate localDate, boolean isElder) {

        List<Person> people = repository.getAll();
        List<Person> sorted = new ArrayList<>();

        for (Person person : people) {
            if (isElder) {
                if (person.getBirthDate().isBefore(localDate)) {
                    sorted.add(person);
                }
                return sorted;
            } else {
                if (person.getBirthDate().isAfter(localDate)) {
                    sorted.add(person);
                }
                return sorted;
            }
        }
        return null;
    }


    @Override
    public List<Person> sortByFriendsCount(int count) {
        List<Person> people = repository.getAll();
        List<Person> sorted = new ArrayList<>();

        for (Person person : people) {
            if (person.getFriends().size() >= count) {
                sorted.add(person);
            }
        }

        return sorted;
    }
}

