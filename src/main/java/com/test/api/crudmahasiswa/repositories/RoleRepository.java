package com.test.api.crudmahasiswa.repositories;

import com.test.api.crudmahasiswa.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
