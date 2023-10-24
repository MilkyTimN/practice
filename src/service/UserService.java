package service;

import enums.Gender;
import enums.UsersStatus;
import models.User;

import java.util.List;

public interface UserService {

    void save(User user);

    void saveAll(List<User> userList);

    User findByUsername(String username);

    List<User> findByGender(Gender gender);

    List<User> findByStatus(UsersStatus status);

    List<User> findByStatusAndGender(UsersStatus status, Gender gender);


}
