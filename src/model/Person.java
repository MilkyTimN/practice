package model;

import model.enums.Gender;
import model.enums.Status;

import java.time.LocalDate;
import java.util.List;

public class Person {

    private int id;
    private String name;
    private Gender gender;
    private Status status;
    private LocalDate birthDate;
    private List<Person> friends;

    public Person(int id, String name, Gender gender, Status status, LocalDate birthDate, List<Person> friends) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.status = status;
        this.birthDate = birthDate;
        this.friends = friends;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", status=" + status +
                ", birthDate=" + birthDate +
                ", friends=" + friends +
                '}';
    }
}
