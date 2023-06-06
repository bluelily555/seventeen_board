package com.seventeen.demo.repository;

import com.seventeen.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    boolean findByIdAndPwd(String id, String pwd);
    boolean existsByIdAndPwd(String id, String pwd);
}
