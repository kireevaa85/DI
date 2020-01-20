package ru.kireev.repostory;

import ru.kireev.domain.User;

import java.util.List;

public interface UserRepository {

    List<User> findAll();

    long create(String name);
}
