package com.example.demo.repository;

import com.example.demo.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by matashrazm on 7/4/2018.
 */
@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {
}
