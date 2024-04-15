package com.rodrigomaia.retratemeuser.repositories;

import com.rodrigomaia.retratemeuser.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
