package ru.proselyte.mcx73app.service;

public interface SecurityService {
    //создаем безопасное приложение

    //будем искать залогининых юзеров
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
