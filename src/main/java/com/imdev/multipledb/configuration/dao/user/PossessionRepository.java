package com.imdev.multipledb.configuration.dao.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baeldung.multipledb.model.user.Possession;

public interface PossessionRepository extends JpaRepository<Possession, Long> {

}
