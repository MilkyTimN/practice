package models;

import enums.Gender;
import enums.UsersStatus;

public class User {

    private String username;
    private Gender gender;
    private UsersStatus status;

    public User(String username, Gender gender, UsersStatus status) {
        this.username = username;
        this.gender = gender;
        this.status = status;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", gender=" + gender +
                ", status=" + status +
                '}';
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public UsersStatus getStatus() {
        return status;
    }

    public void setStatus(UsersStatus status) {
        this.status = status;
    }
}
