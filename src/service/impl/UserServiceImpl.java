package service.impl;

import enums.Gender;
import enums.UsersStatus;
import models.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    List<User> userList = new ArrayList<>();

    @Override
    public void save(User user) {
        userList.add(user);
    }

    @Override
    public User findByUsername(String username) {
        for (User item : userList) {
            if (item.getUsername().equals(username)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public List<User> findByGender(Gender gender) {
        List<User> sortedByGenderList = new ArrayList<>();

        for (User user : userList) {
            if (user.getGender().ordinal() == gender.ordinal()) {
                sortedByGenderList.add(user);
            }
        }

        return sortedByGenderList;
    }

    @Override
    public List<User> findByStatus(UsersStatus status) {

        List<User> sortedByStatusList = new ArrayList<>();

        for (User user : userList) {
            if (user.getStatus().equals(status)) {
                sortedByStatusList.add(user);
            }

        }

        return sortedByStatusList;
    }

    @Override
    public void saveAll(List<User> listToSave) {
        for (User user : listToSave) {
            userList.add(user);
        }
    }

    @Override
    public List<User> findByStatusAndGender(UsersStatus status, Gender gender) {

        List<User> sortedByStatusAndGenderList = new ArrayList<>();

        for (User user : userList) {
            if (user.getStatus().equals(status) && user.getGender().equals(gender)) {
                sortedByStatusAndGenderList.add(user);
            }
        }
        return sortedByStatusAndGenderList;
    }
}
