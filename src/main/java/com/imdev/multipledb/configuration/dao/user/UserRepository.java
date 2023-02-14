package com.imdev.multipledb.configuration.dao.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baeldung.multipledb.model.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}