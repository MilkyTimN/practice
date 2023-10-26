package service;

import model.Person;
import model.enums.Gender;
import model.enums.Status;

import java.time.LocalDate;
import java.util.List;

public interface PersonService {

    //  save(),
    //  saveAll()
    //  findByGender(),
    //  findStatus(),
    //  findByName()
    //  deleteAll()
    //  delete()
    //  update()
    //  sortByDateElder()
    //  sortByDateYounger()
    //  sortByFriendsCount()

    void save(Person person);
    void saveAll(List<Person> people);
    List<Person> findByGender(Gender gender);
    List<Person> findByStatus(Status gender);
    Person findByName(String name);
    void deleteAll(List<Person>peopleToDelete);
    void delete(Person person);
    void update(Person person);
    List<Person> sortByDateElder(LocalDate localDate, boolean isElder);
    List<Person> sortByFriendsCount(int count);

}
