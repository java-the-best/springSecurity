package com.example.springSecurity.repo;

import com.example.springSecurity.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
}
