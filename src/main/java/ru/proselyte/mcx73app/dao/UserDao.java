package ru.proselyte.mcx73app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.proselyte.mcx73app.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    //метод вернет нам пользователя по его имени
    User findByUsername(String username);
}
