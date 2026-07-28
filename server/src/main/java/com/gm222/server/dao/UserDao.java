package com.gm222.server.dao;

import com.gm222.server.model.entity.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<users, Long> {
    Optional<users> findByEmailAndUsername(String email, String username);
}
