package ru.proselyte.mcx73app.service;
import ru.proselyte.mcx73app.model.User;

public interface UserService {

    //сохраним пользователя
    void save(User user);

    //получим пользователя по имени
    User findByUsername(String username);
}
