package com.huyvn.happytostudy.repository;

import com.huyvn.happytostudy.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);
    List<User> findAll();
}
