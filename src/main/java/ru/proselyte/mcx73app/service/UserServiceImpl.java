package ru.proselyte.mcx73app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.proselyte.mcx73app.dao.RoleDao;
import ru.proselyte.mcx73app.dao.UserDao;
import ru.proselyte.mcx73app.model.Role;
import ru.proselyte.mcx73app.model.User;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        //закриптуем пароль пользователя
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        //каждый новый пользователь будет получать роль юзера id=1
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1L));
        //установили роль юзеру
        user.setRoles(roles);
        //записали данные юзера
        userDao.save(user);
    }

    @Override
    public User findByUsername(String username) {
        //получим юзера из базы данных по его имени
        return userDao.findByUsername(username);
    }
}
