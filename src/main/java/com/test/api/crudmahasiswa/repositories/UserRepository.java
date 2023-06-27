package com.test.api.crudmahasiswa.repositories;

import com.test.api.crudmahasiswa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
