package service.impl;

import model.Person;
import model.enums.Gender;
import model.enums.Status;
import repository.PersonRepository;
import service.PersonService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService {


    PersonRepository repository = new PersonRepository();

    @Override
    public void save(Person person) {
        repository.save(person);
    }

    @Override
    public void saveAll(List<Person> people) {
        for (Person person : people) {
            save(person);
        }
    }

    @Override
    public List<Person> getAll() {
        return repository.findBy();
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
        for (Person person : peopleToDelete) {
            delete(person);
        }
    }

    
    @Override
    public void delete(Person person) {
        repository.delete(person);
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

        //getAll() вызывается из этого же класса (строка 30)
        List<Person> people = getAll();
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
        
        //getAll() вызывается из этого же класса (строка 30)
        List<Person> people = getAll();
        List<Person> sorted = new ArrayList<>();

        for (Person person : people) {
            if (person.getFriends().size() >= count) {
                sorted.add(person);
            }
        }

        return sorted;
    }

    @Override
    public void changeBirthDate(String birthDate, Person person) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate updatedBirthDate = LocalDate.parse(birthDate, formatter);

        person.setBirthDate(updatedBirthDate);

        //update(Person person) вызывается из этого же класса (строка 63)
        update(person);
        

    }
}

