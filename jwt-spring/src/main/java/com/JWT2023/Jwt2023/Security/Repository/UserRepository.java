package com.JWT2023.Jwt2023.Security.Repository;

import com.JWT2023.Jwt2023.Security.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    //Buscar un usuario por email
    Optional<User> findByEmail(String email);
}
