package repository;

import model.Person;
import model.enums.Gender;
import model.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    List<Person> db = new ArrayList<>();


    public List<Person> findBy() {
        return db;
    }

    public Person getById(int id) {
        return db.get(id);
    }

    public void update(Person person) {
        db.set(person.getId(), person);
    }

    public void delete(Person person) {
        db.remove(person.getId());
    }


    public void save(Person person) {
        db.add(person);
    }



}
