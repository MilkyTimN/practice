package repository;

import model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    List<Person> db = new ArrayList<>();


    public List<Person> getAll() {
        return db;
    }

    public Person getById(int id) {
        return db.get(id);
    }

    public void update(Person person) {
        db.set(person.getId(), person);
    }
}
