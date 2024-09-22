package com.application.ecommerce.repository;

import com.application.ecommerce.modals.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
}
