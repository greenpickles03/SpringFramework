package com.springframework.Spring.Framework.repository;

import com.springframework.Spring.Framework.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "Select * FROM users u WHERE u.username = :username AND u.password = :password", nativeQuery = true)
    List<User> findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
