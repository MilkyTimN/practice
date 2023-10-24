import enums.Gender;
import enums.UsersStatus;
import models.User;
import service.UserService;
import service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //name() - возвращает имя
        //ordinal() - возвращает порядковый номер
        //values()
        //valueOf()


        //UserService{
        //  save(models.User user),
        //  findByUserName(String username),
        //  findByGender(enums.Gender gender),
        //  findByStatus(Status status)
        //  }

        UserService service = new UserServiceImpl();

        User user = new User();
        user.setUsername("tims");
        user.setGender(Gender.MALE);
        user.setStatus(UsersStatus.ACTIVE);

        User user1 = new User();
        user1.setUsername("2tims");
        user1.setGender(Gender.MALE);
        user1.setStatus(UsersStatus.BLOCKED);

        User user2 = new User();
        user2.setUsername("3tims");
        user2.setGender(Gender.FEMALE);
        user2.setStatus(UsersStatus.DELETED);

        User user3 = new User();
        user3.setUsername("4tims");
        user3.setGender(Gender.OTHER);
        user3.setStatus(UsersStatus.ACTIVE);

        List<User> toSave = new ArrayList<>();
        toSave.add(user);
        toSave.add(user1);
        toSave.add(user2);
        toSave.add(user3);

        service.saveAll(toSave);

        System.out.println(service.findByStatusAndGender(UsersStatus.ACTIVE, Gender.MALE));






































        //Car(CarBrand brand, CarModel model, CarType type)
        //CarService{
        //  save(models.User user),

        //  findByCarModel(String username),
        //  findByCarBrand(enums.Gender gender),
        //  findCarType(Status status)
        //  }
        //

    }
}