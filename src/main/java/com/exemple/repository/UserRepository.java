package com.exemple.repository;

import com.exemple.model.User;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<User, Integer> {
    // Additional custom query methods can be defined here
}
